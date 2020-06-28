package top.devoty.common;

public class BaseException extends Exception {

    public BaseException(IResponseEnum responseEnum, Object[] args, String message) {
        super(message);
    }

    public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super();
    }


}
