package com.tmm.mall.api.request.base;

import java.util.UUID;

/**
 * @Author： tangmingming
 * @Date: 2020-10-23 18:07
 * @Version： 1.0
 */

public class BaseRequest {

    /**
     * 请求ID
     */
    private String requestId;

    public BaseRequest(){
        this.requestId = UUID.randomUUID().toString();
    }

    public BaseRequest(String requestId){
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requesetId) {
        this.requestId = requesetId;
    }
}
