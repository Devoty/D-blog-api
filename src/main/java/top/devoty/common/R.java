package top.devoty.common;

public class R<T> {

    /**
     * 代码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 结果数据
     */
    private T data;

    public R(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R(int code, String msg){
        this(code, msg, (T) "");
    }

    public static <T> R<T> ok(){
        return new R<T>(200, "操作成功");
    }

    public static <T> R<T> ok(T data){
        return new R<>(200, "操作成功", data);
    }

    public static <T> R<T> error(){
        return new R<T>(500, "未知错误");
    }

    public static <T> R<T> error(int code, String msg){
        return new R<T>(code, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
