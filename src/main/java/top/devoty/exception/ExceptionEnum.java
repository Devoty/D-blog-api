package top.devoty.exception;

public enum ExceptionEnum implements CommonEnum{

    SUCCESS(200, "操作成功"),
    ARGUE_ERROR(100, "参数错误"),
    FILE_ERROR(501,"文件上传失败"),
    UNKNOWN_ERROR(500, "参数错误");

    private int code;
    private String msg;

    ExceptionEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
