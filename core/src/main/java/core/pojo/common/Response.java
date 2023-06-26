package core.pojo.common;

import core.constants.ResponseStatus;
import lombok.Data;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@RestControllerAdvice
public class Response<T> implements Serializable {

    private Integer code;

    private String msg;

    private Timestamp createdTime;

    private T data;

    private Response() {

    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<T>();
        response.setCode(ResponseStatus.OK.code);
        response.setMsg(ResponseStatus.OK.msg);
        response.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        response.setData(data);
        return response;
    }

    public static <T> Response<T> error(ResponseStatus status, T data) {
        Response<T> response = new Response<T>();
        response.setCode(status.code);
        response.setMsg(status.msg);
        response.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        response.setData(data);
        return response;
    }

}
