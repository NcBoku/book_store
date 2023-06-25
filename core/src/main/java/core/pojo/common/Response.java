package core.pojo.common;

import core.constants.ResponseStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private ResponseStatus status;

    private T data;

    private Response() {

    }

    public static <T> Response<T> ok(T data) {
        Response<T> response = new Response<T>();
        response.setStatus(ResponseStatus.OK);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> error(ResponseStatus status, T data) {
        Response<T> response = new Response<T>();
        response.setStatus(status);
        response.setData(data);
        return response;
    }

}
