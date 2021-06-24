package cn.simplethinking.miniblogapp.admin.exception;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class AdminNotExistException extends RuntimeException {
    public AdminNotExistException() {
    }

    public AdminNotExistException(String message) {
        super(message);
    }

    public AdminNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminNotExistException(Throwable cause) {
        super(cause);
    }

    public AdminNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
