package cn.simplethinking.miniblogapp.system.exception;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class FileErrorException extends RuntimeException {
    public FileErrorException() {
    }

    public FileErrorException(String message) {
        super(message);
    }

    public FileErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileErrorException(Throwable cause) {
        super(cause);
    }

    public FileErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
