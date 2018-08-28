package com.jlt.analysis.common;

public enum ErrorEnum {
    ERROR_10000(10000, "装机记录失败")
    ;

    private Integer code;//结果编码
    private String msg;//结果信息

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}