package com.javanorth.javanorthapp.admin.exception;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description
 * @see
 * @since
 */
public class AdminPasswordErrorException extends RuntimeException {
    public AdminPasswordErrorException() {
    }

    public AdminPasswordErrorException(String message) {
        super(message);
    }

    public AdminPasswordErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminPasswordErrorException(Throwable cause) {
        super(cause);
    }

    public AdminPasswordErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
