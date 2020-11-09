package com.tmm.mall.api.request.base;

import com.tmm.mall.api.request.base.BaseRequest;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 14:13
 * @Version： 1.0
 */

public class PageRequest extends BaseRequest {

    /**
     * 当前页
     */
    private Integer currentPage = 1;

    /**
     * 页数
     */
    private Integer pageSize = 10;

    public PageRequest(){
        super();
    }

    public PageRequest(Integer currentPage, Integer pageSize){
        super();
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
