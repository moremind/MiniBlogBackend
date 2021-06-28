package cn.simplethinking.miniblogapp.system.constant;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class GiteeConstant {

    public static final String DEFAULT_IMG_DIR = "img";

    // post https://gitee.com/api/v5/repos/{owner}/{repo}/contents/{path}
    public static final String CREATE_FILE_URL = "https://gitee.com/api/v5/repos/%s/%s/contents/%s";

    // get https://gitee.com/api/v5/repos/{owner}/{repo}/contents/{path}
    public static final String GET_IMG_URL = "https://gitee.com/api/v5/repos/%s/%s/contents/%s";

    // delete https://gitee.com/api/v5/repos/{owner}/{repo}/contents/{path}
    public static final String DELETE_FILE_URL = "https://gitee.com/api/v5/repos/%s/%s/contents/%s";
}
