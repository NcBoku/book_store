package core.pojo.common;

import core.constants.ResponseStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    private ResponseStatus status;

    private Object data;

    private Response() {

    }

    public static Response ok(Object data) {
        Response response = new Response();
        response.setStatus(ResponseStatus.OK);
        response.setData(data);
        return response;
    }

    public static Response error(ResponseStatus status, Object data) {
        Response response = new Response();
        response.setStatus(status);
        response.setData(data);
        return response;
    }

}
