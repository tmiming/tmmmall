package com.tmm.mall.api.response.base;
import com.tmm.mall.api.enums.ReturnCode;

/**
 * @Author： tangmingming
 * @Date: 2020-10-23 18:20
 * @Version： 1.0
 */

public class BaseResponse<T> extends SimpleResponse {

    private T data;

    public BaseResponse(){
        super();
    }

    public BaseResponse(T data){
        super();
        this.data = data;
    }

    public BaseResponse(String requestId, Long elapseTime, T data){
        super(requestId, elapseTime);
        this.data = data;
    }



    public  static <T> BaseResponse<T> of(T data){
        return new BaseResponse<T>(data);
    }

    public static <T> BaseResponse<T> of(String requestId, Long elapseTime, T data){
        return new BaseResponse<T>(requestId, elapseTime, data);
    }

    public static <T> BaseResponse<T> ofError(String code, String message, String... args){
        BaseResponse<T> response = new BaseResponse<T>();
        response.setError(code, message, args);
        return response;
    }

    public static <T> BaseResponse<T> ofError(T data, String code, String message, String... args){
        BaseResponse<T> response = new BaseResponse<T>();
        response.setError(code, message, args);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> ofError(ReturnCode returnCode, String... args){
        BaseResponse<T> response = new BaseResponse<T>();
        response.setError(returnCode.getCode(), returnCode.getDesc(), args);
        return response;
    }

    public static <T> BaseResponse<T> ofError(T data, ReturnCode returnCode, String... args){
        BaseResponse<T> response = new BaseResponse<T>();
        response.setError(returnCode.getCode(), returnCode.getDesc(), args);
        response.setData(data);
        return response;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
