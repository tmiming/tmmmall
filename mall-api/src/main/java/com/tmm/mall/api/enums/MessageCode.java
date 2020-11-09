package com.tmm.mall.api.enums;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 14:57
 * @Version： 1.0
 */

public enum  MessageCode implements ReturnCode{

    /**
     * 成功
     */
    SUCCESSS("200", "成功"),
    ;

    MessageCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    String code;

    String desc;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }}
