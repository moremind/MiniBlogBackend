package cn.simplethinking.miniblogapp.system.util;

import cn.hutool.core.codec.Base64;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.simplethinking.miniblogapp.system.config.GiteeFileConfiguration;
import cn.simplethinking.miniblogapp.system.constant.GiteeConstant;
import cn.simplethinking.miniblogapp.system.exception.FileErrorException;
import cn.simplethinking.miniblogapp.system.exception.GiteeFileUploadException;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 文件上传组件
 * @see
 * @since
 */
public class GiteeFileUtil {

    // gitee的配置
    private static final String ACCESS_TOKEN_STR = "access_token";

    private static final String CONTENT_STR = "content";

    private static final String MESSAGE_STR = "message";

    private static final String CONTENT_MESSAGE = "content";

    private static final String DOWNLOAD_URL_MESSAGE = "download_url";

    private static final String COMMIT_MESSAGE = "commit";

    private static final String SHA_MESSAGE = "sha";

    /**
     * Gitee 文件上传接口
     * @param file 文件相关配置
     * @return 文件相关的url
     * @throws IOException
     */
    public static Object giteeUpload(MultipartFile file) throws IOException {
        GiteeFileConfiguration giteeFileConfiguration = SpringContextUtil.getBean(GiteeFileConfiguration.class);
        RestTemplate restTemplate = SpringContextUtil.getBean("restTemplate");

        String targetFile = getTargetFileName(giteeFileConfiguration.getPath(), getFileSuffix(file.getOriginalFilename()));
        // construct url
        String uploadUrl = String.format(GiteeConstant.CREATE_FILE_URL, giteeFileConfiguration.getOwner(),
                giteeFileConfiguration.getRepository(), targetFile);

        // setting parameters
        Map<String, String> uploadParam = new HashMap<>();
        uploadParam.put(ACCESS_TOKEN_STR, giteeFileConfiguration.getACCESS_TOKEN());
        // content必须是base64编码
        uploadParam.put(CONTENT_STR, Base64.encode(file.getBytes()));
        // 文件上传的信息
        uploadParam.put(MESSAGE_STR, GiteeFileConfiguration.UPLOAD_MESSAGE);

        String result = restTemplate.postForEntity(uploadUrl, uploadParam, String.class).getBody();
        JSONObject resultJson = JSONUtil.parseObj(result);
        if (resultJson.isEmpty() || resultJson.getObj(COMMIT_MESSAGE) == null) {
            throw new GiteeFileUploadException(ResultEnum.GITEE_FILE_UPLOAD_EXCEPTION.getMessage());
        }

        JSONObject content = JSONUtil.parseObj(resultJson.getObj(CONTENT_MESSAGE));
        return content.getObj(DOWNLOAD_URL_MESSAGE);
    }

    /**
     * gitee 删除文件
     * @param filePath 文件http/https路径
     * @return 是否删除成功
     */
    public static boolean giteeFileDelete(String filePath) {
        GiteeFileConfiguration giteeFileConfiguration = SpringContextUtil.getBean(GiteeFileConfiguration.class);
        RestTemplate restTemplate = SpringContextUtil.getBean("restTemplate");
        String path = filePath.split("master/")[1];
        if (StringUtils.isEmpty(path)) {
            throw new FileErrorException(ResultEnum.FILE_NOT_EXIST.getMessage());
        }
        // 格式化路径
        String fileUrl = String.format(GiteeConstant.GET_IMG_URL, giteeFileConfiguration.getOwner(),
                giteeFileConfiguration.getRepository(), path);

        // 需要异常判断
        String getFileResult = restTemplate.getForObject(fileUrl, String.class);

        // 解析获取文件sha等相关信息
        JSONObject fileResultJson = JSONUtil.parseObj(getFileResult);

        // 构建请求的query参数
        Map<String, String> requestParam = new HashMap<>();
        requestParam.put(ACCESS_TOKEN_STR, giteeFileConfiguration.getACCESS_TOKEN());
        requestParam.put(SHA_MESSAGE, String.valueOf(fileResultJson.get(SHA_MESSAGE)));
        requestParam.put(MESSAGE_STR, GiteeFileConfiguration.DELETE_MESSAGE);

        String deleteRequestUrl = String.format(GiteeConstant.DELETE_FILE_URL, giteeFileConfiguration.getOwner(),
                giteeFileConfiguration.getRepository(), path);

        // 调用删除文件服务 异常判断
        String result = restTemplate.exchange(deleteRequestUrl, HttpMethod.DELETE, new HttpEntity<>(requestParam),
                String.class).getBody();

        return result != null;
    }

    /**
     * 获取文件名后缀，用户重新构建文件名
     * @param originFileName 文件名
     * @return 文件名后缀
     */
    private static String getFileSuffix(String originFileName) {
        Optional.ofNullable(originFileName).orElseThrow(() -> new FileErrorException(
                ResultEnum.FILE_NAME_ERROR.getMessage()));
        return originFileName.substring(originFileName.lastIndexOf("."));
    }

    /**
     * 构建文件上传的路径
     * e.g. /img/2021-05-27/xxx.png
     * @param repoPath
     * @return
     */
    private static String getTargetFileName(String repoPath, String suffix) {
        Optional.ofNullable(repoPath).orElse(GiteeConstant.DEFAULT_IMG_DIR);
        // 构建文件url
        return repoPath + "/" + DateUtil.getDaytime() + "/" + DateUtil.getCurrentTimestamp() + suffix;
    }



}
