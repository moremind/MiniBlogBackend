package cn.simplethinking.miniblogapp.system.response;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description 全局异常信息
 * @see
 * @since 1.0.0
 */
public enum ResultEnum {
    /**
     * 模拟Http通用接口，通常成功的接口显示与失败的接口显示对立
     * 20000-30000:表示接口调用成功
     * 20000:表示通用全局性接口调用成功
     *
     * 40000-50000:表示接口调用失败
     * 40000:表示通用全局性接口调用失败
     *
     *
     */
    GLOBAL_SUCCESS(20000, "Success"),




    //MINI-APP
    // 成功状态接口
    WECHAT_LOGIN_SUCCESS(21000, "WeChat Login Success"),

    // ADMIN
    ADMIN_LOGIN_SUCCESS(22000, "admin login success"),

    GITEE_FILE_UPLOAD_SUCCESS(20100, "Gitee File Upload Success"),

    GITEE_FILE_DELETE_SUCCESS(20101, "Gitee File Delete Success"),



    // 失败状态接口
    GLOBAL_EXCEPTION(40000, "Global Exception"),

    // 文件相关错误
    FILE_NAME_ERROR(40001, "File OriginName Error"),

    FILE_NOT_EXIST(40002, "File Not Exist"),

    GITEE_FILE_UPLOAD_EXCEPTION(40100, "Upload File To Gitee Failed"),

    GITEE_FILE_DELETE_FAILED(40101, "Gitee File Delete Failed"),

    // MINI-APP
    WECHAT_LOGIN_FAILED(41000, "WeChat Login Failed"),

    // ADMIN
    ADMIN_USER_NOT_EXIST(42000, "admin not exist"),
    ADMIN_USER_PASSWORD_ERROR(42001, "admin password error"),
    ;






    private final int code;
    private final String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
