package com.javanorth.javanorthapp.miniapp.exception;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description wechat user login exception
 * @see
 * @since 1.0.0
 */
public class WeChatUserLoginException extends RuntimeException {
    public WeChatUserLoginException() {
    }

    public WeChatUserLoginException(String message) {
        super(message);
    }

    public WeChatUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public WeChatUserLoginException(Throwable cause) {
        super(cause);
    }

    public WeChatUserLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
