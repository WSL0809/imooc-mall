package com.imooc.mall.exception;

public enum ImoocMallExceptionEnum {
    NEED_USER_NAME(10001, "用户名不能为空"),
    NEED_USER_PASSWORD(10002,"密码不能为空"),
    PASSWORD_TOO_SHORT(10003,"密码太短"),
    NAME_EXISTED(10004,"名字存在"),
    INSERT_FAILED(10005,"插入失败"),
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
