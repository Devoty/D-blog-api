package top.devoty.common;

public enum  ResponseEnum implements BusinessExceptionAssert {
    /**
     * Bad licence type
     */
    BAD_LICENCE_TYPE(7001, "Bad licence type."),
    /**
     * Licence not found
     */
    LICENCE_NOT_FOUND(7002, "Licence not found.")
    ;

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;

    ResponseEnum(int i, String s) {
        this.code = i;
        this.message = s;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(512);
        sb.append("ResponseEnum [");
        sb.append(super.toString());
        sb.append("\n    code=").append(this.code);
        sb.append("\n    message=").append(this.message);
        sb.append("\n]");
        return sb.toString();
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
