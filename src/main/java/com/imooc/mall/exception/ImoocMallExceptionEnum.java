package com.imooc.mall.exception;

public enum ImoocMallExceptionEnum {
    NEED_USER_NAME(10001, "用户名不能为空"),
    NEED_USER_PASSWORD(10002,"密码不能为空"),
    PASSWORD_TOO_SHORT(10003,"密码太短"),
    NAME_EXISTED(10004,"名字存在"),
    INSERT_FAILED(10005,"插入失败"),
    WRONG_PASSWORD(10006,"密码错误"),
    NEED_LOGIN(10007,"需要先登录"),
    UPDATE_FAILED(10008,"更新失败"),
    NEED_ADMIN(10009,"无管理员权限"),
    PARA_NOT_NULL(10010,"参数不能为空"),
    CREATE_FAILED(10011,"新增失败"),
    REQUEST_PARAM_ERROR(10012,"参数错误"),
    STSTEM_ERROR(20000,"系统异常");

    Integer code;
    String msg;

    ImoocMallExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
