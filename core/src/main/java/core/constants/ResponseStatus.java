package core.constants;

public enum ResponseStatus {

    OK(200, "成功"),
    REDIRECT(302, "重定向"),
    REQUEST_ERROR(400, "请求参数错误"),
    NOT_FOUND(404, "访问不存在的资源"),
    INTERNAL_ERROR(500, "系统内部错误");

    public Integer code;

    public String msg;

    ResponseStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}