package com.tmm.mall.api.response.base;

import com.tmm.mall.api.enums.ReturnCode;

import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 11:26
 * @Version： 1.0
 */

public class PageResponse<T> extends BaseResponse<PageData<T>> {

    public PageResponse(){}

    public PageResponse(List<T> data, PageInfo pageInfo){
        super(new PageData<T>(data, pageInfo));
    }

    public PageResponse(PageData<T> data){
        super(data);
    }

    public static <T> PageResponse<T> of(PageData<T> data){
        return new PageResponse<T>(data);
    }

    public static PageResponse ofError(String code, String message, String... args){
        PageResponse response = new PageResponse();
        response.setError(code, message, args);
        return response;
    }

    public static PageResponse ofError(ReturnCode returnCode, String... args){
        PageResponse response = new PageResponse();
        response.setError(returnCode.getCode(), returnCode.getDesc(), args);
        return response;
    }

}
