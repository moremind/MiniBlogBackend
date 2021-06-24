package cn.simplethinking.miniblogapp.system.response;

/**
 * @author <a href="hefengen@hotmail.com">finen</a>
 * @description http response result
 * @see Result
 * @since 1.0
 */
public class Result {
    private int code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Builder模式
     */
    public Result(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static final class Builder {
        private int code;
        private String message;
        private Object data;

        public Builder() {
        }

        public Builder(int code, String msg) {
            this.code = code;
            this.message = msg;
        }

        public Builder(int code, String msg, Object data) {
            this.code = code;
            this.message = msg;
            this.data = data;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        public Builder message(String msg) {
            this.message = msg;
            return this;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public Result build() {
            // 需要检查线程安全
            return new Result(this);
        }
    }
}
