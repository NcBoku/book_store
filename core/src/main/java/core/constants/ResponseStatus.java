package core.constants;

public enum ResponseStatus {

    OK(200, "成功"),
    REQUEST_ERROR(400, "请求参数错误"),
    INVALID_REFRESH_TOKEN_ERROR(401,"非法的refresh_token"),
    INVALID_ACCESS_TOKEN_ERROR(402,"非法的access_token"),
    NOT_EXIST_ERROR(404, "不存在的资源"),
    INTERNAL_ERROR(500, "系统内部错误");

    public final Integer code;

    public final String msg;

    ResponseStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}