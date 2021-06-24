package cn.simplethinking.miniblogapp.admin.service;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public interface AdminService {

    /**
     * 登录流程
     * @param username 管理员用户名
     * @return 管理员相关信息
     */
    boolean login(String username, String password);
}
