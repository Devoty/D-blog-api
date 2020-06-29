package top.devoty.exception;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.devoty.common.R;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数验证异常(前端json格式提交)
     *
     * @param e 异常
     * @return 响应实体
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleParameterException(MethodArgumentNotValidException e) {
        String errorMessage = getErrorMessage(e.getBindingResult());
        return R.errorParam(errorMessage);
    }

    /**
     * 参数验证异常(前端form表单格式提交)
     *
     * @param e 异常
     * @return http响应对象
     */
    @ExceptionHandler(BindException.class)
    public R handlerBindException(BindException e) {
        String errorMessage = getErrorMessage(e.getBindingResult());
        return R.errorParam(errorMessage);
    }
    /**
     * 获取参数验证的结果
     *
     * @param bindingResult 参数验证的绑定结果
     * @return 验证结果
     */
    public String getErrorMessage(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (ObjectError error : bindingResult.getAllErrors()) {
                sb.append(error.getDefaultMessage()+ ";");
            }
            return sb.toString();
        }
        return null;
    }
    //全局异常捕捉处理
    @ExceptionHandler(value = Exception.class)
    public R errorHandler(Exception e) {
        //自定义异常处理
        e.printStackTrace();
        return R.error();
    }

    // 全局业务异常捕捉处理
    @ExceptionHandler(value = ServiceException.class)
    public R serviceErrorHandler(ServiceException e) {
        //自定义业务异常处理
        e.printStackTrace();
        return R.error();
    }

}
