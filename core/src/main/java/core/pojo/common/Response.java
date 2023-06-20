package core.pojo.common;

import core.pojo.common.constants.ResponseStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class Response implements Serializable {

    private ResponseStatus status;

    private Object data;

    private Response() {

    }

    public static Response ok(ResponseStatus status) {
        Response response = new Response();
        response.status = status;
        return response;
    }

    public static Response ok(ResponseStatus status, Object data) {
        Response response = ok(status);
        response.setData(data);
        return response;
    }

}
