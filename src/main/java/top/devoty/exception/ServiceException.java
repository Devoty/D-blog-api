package top.devoty.exception;

import java.io.Serializable;

public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1213855733833039552L;

    private int code;

    private String message;

    public ServiceException() {
        this.code = ExceptionEnum.UNKNOWN_ERROR.getCode();
        this.message = ExceptionEnum.UNKNOWN_ERROR.getMsg();

    }

    public ServiceException(CommonEnum commonEnum) {
        this.message = commonEnum.getMsg();
        this.code = commonEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
