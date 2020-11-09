package com.tmm.mall.api.response.base;

import java.util.Collections;
import java.util.List;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 11:27
 * @Version： 1.0
 */

public class PageData<T> {

    /**
     * 列表信息
     */
    private List<T> listInfo;

    /**
     * 分页信息
     */
    private PageInfo pageInfo;

    public PageData(List<T> listInfo, PageInfo pageInfo){
        this.listInfo = listInfo;
        this.pageInfo = pageInfo;
    }

    public List<T> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<T> listInfo) {
        this.listInfo = listInfo;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public static <T> PageData<T> emptyData(){
        return new PageData<>(Collections.emptyList(), PageInfo.EMPTY);
    }

    public static <T> PageData<T> of(List<T> listInfo, PageInfo pageInfo){
        return new PageData<T>(listInfo, pageInfo);
    }
}
