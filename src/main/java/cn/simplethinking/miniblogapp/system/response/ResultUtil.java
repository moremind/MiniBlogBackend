package cn.simplethinking.miniblogapp.system.response;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description ResultUtil
 * @see Result
 * @since 1.0.0
 */
public class ResultUtil {
    public static Result success(int code, String message) {
        return new Result.Builder().code(code)
                .message(message)
                .build();
    }

    public static Result success(int code, String message, Object data) {
        return new Result.Builder().code(code)
                .message(message)
                .data(data)
                .build();
    }

    public static Result fail(int code, String message) {
        return new Result.Builder().code(code)
                .message(message)
                .build();
    }

    public static Result fail(int code, String message, Object data) {
        return new Result.Builder().code(code)
                .message(message)
                .data(data)
                .build();
    }
}
