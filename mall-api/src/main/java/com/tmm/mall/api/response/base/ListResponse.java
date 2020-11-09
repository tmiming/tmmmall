package com.tmm.mall.api.response.base;

import com.tmm.mall.api.enums.ReturnCode;

import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 11:08
 * @Version： 1.0
 */

public class ListResponse<T> extends BaseResponse<List<T>>{

    public ListResponse(){}

    public ListResponse(List<T> data){
        super(data);
    }

    public static <T> ListResponse<T> of(List<T> data){
        return new ListResponse<T>(data);
    }

    public static ListResponse ofError(String code, String message, String... args){
        ListResponse response = new ListResponse();
        response.setError(code, message, args);
        return response;
    }

    public static ListResponse ofError(ReturnCode returnCode, String... args){
        ListResponse response = new ListResponse();
        response.setError(returnCode.getCode(), returnCode.getDesc(), args);
        return response;
    }



}
