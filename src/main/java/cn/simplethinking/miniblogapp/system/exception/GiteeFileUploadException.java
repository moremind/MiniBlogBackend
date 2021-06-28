package cn.simplethinking.miniblogapp.system.exception;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class GiteeFileUploadException extends RuntimeException {
    public GiteeFileUploadException() {
    }

    public GiteeFileUploadException(String message) {
        super(message);
    }

    public GiteeFileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public GiteeFileUploadException(Throwable cause) {
        super(cause);
    }

    public GiteeFileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
