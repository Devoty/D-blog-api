package top.devoty.common;

import top.devoty.exception.CommonEnum;
import top.devoty.exception.ExceptionEnum;

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
        this.code = code;
        this.msg = msg;
    }

    public R(CommonEnum commonEnum){
        this.msg = commonEnum.getMsg();
        this.code = commonEnum.getCode();
    }

    public R(CommonEnum commonEnum, T data){
        this.msg = commonEnum.getMsg();
        this.code = commonEnum.getCode();
        this.data = data;
    }

    public static <T> R<T> ok(){
        return new R<>(ExceptionEnum.SUCCESS);
    }

    public static <T> R<T> ok(T data){
        return new R<>(ExceptionEnum.SUCCESS, data);
    }

    public static <T> R<T> error(){
        return new R<>(ExceptionEnum.UNKNOWN_ERROR);
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
