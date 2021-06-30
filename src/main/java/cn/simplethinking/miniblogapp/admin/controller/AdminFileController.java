package cn.simplethinking.miniblogapp.admin.controller;

import cn.simplethinking.miniblogapp.admin.request.AdminDeleteFileRequest;
import cn.simplethinking.miniblogapp.system.response.Result;
import cn.simplethinking.miniblogapp.system.response.ResultEnum;
import cn.simplethinking.miniblogapp.system.response.ResultUtil;
import cn.simplethinking.miniblogapp.system.util.GiteeFileUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 服务端文件上传功能
 * @see
 * @since
 */
@RestController
@RequestMapping("/admin/file")
public class AdminFileController  {

    /**
     * 文件上传至gitee接口
     * @param file
     * @return 返回文件上传成功后的路径
     * @throws IOException
     */
    @RequestMapping(value = "/gitee/upload")
    public Result giteeFileUpload(@RequestParam MultipartFile file) throws IOException {
        Object result = GiteeFileUtil.giteeUpload(file);
        return ResultUtil.success(ResultEnum.GITEE_FILE_UPLOAD_SUCCESS.getCode(),
                ResultEnum.GITEE_FILE_UPLOAD_SUCCESS.getMessage(),
                String.valueOf(result));
    }

    @RequestMapping(value = "/gitee/delete", method = RequestMethod.POST)
    public Result giteeFileDelete(@RequestBody AdminDeleteFileRequest path) {
        boolean result = GiteeFileUtil.giteeFileDelete(path.getPath());
        return ResultUtil.success(ResultEnum.GITEE_FILE_DELETE_SUCCESS.getCode(),
                ResultEnum.GITEE_FILE_DELETE_SUCCESS.getMessage(), result);
    }

}
