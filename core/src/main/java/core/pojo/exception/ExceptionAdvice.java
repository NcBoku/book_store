package core.pojo.exception;

import core.constants.ResponseStatus;
import core.pojo.common.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(ResourceNotExistException.class)
    public Response<String> handleResourceNotExistException(ResourceNotExistException e){
        log.error(e.getMessage());
        return Response.<String>error(ResponseStatus.NOT_FOUND,e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Response<String> handleException(Exception e){
        log.error(e.getMessage());
        return Response.<String>error(ResponseStatus.INTERNAL_ERROR,"未知的内部错误");
    }
}
