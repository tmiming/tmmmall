package com.tmm.mall.api.response.base;

import com.tmm.mall.api.enums.MessageCode;
import com.tmm.mall.api.enums.ReturnCode;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 15:32
 * @Version： 1.0
 */

public class SimpleResponse {

    private String requestId;

    private boolean success;

    private String code;

    private String message;

    private Long elapseTime;

    public SimpleResponse(){
        this.code = MessageCode.SUCCESSS.getCode();
        this.message = MessageCode.SUCCESSS.getDesc();
        this.success = true;
    }

    public SimpleResponse(String requestId, Long elapseTime){
        this();
        this.requestId = requestId;
        this.elapseTime = elapseTime;
    }


    public SimpleResponse(String requestId, boolean success, String code, String message, Long elapseTime){
        this.requestId = requestId;
        this.success = success;
        this.code = code;
        this.message = message;
        this.elapseTime = elapseTime;
    }

    public void setError(String code, String message, String... args){
        this.code = code;
        this.message = String.format(message, args);
        this.success = false;
    }


    public void setError(ReturnCode returnCode){
        setError(returnCode.getCode(), returnCode.getDesc(), null);
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getElapseTime() {
        return elapseTime;
    }

    public void setElapseTime(Long elapseTime) {
        this.elapseTime = elapseTime;
    }
}
