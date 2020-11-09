package com.tmm.mall.api.response.base;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 11:28
 * @Version： 1.0
 */

public class PageInfo {

    public static final PageInfo EMPTY = new PageInfo(1, 10, 0, 0);

    /**
     * 当前页
     */
    private int currentPage;

    /**
     *  每页条数
     */
    private int pageSize = 10;

    /**
     * 总条数
     */
    private int totalCount;

    /**
     * 总页数
     */
    private int pageCount;

    /**
     * 当前页数据条数
     */
    private int currentCount;

    public PageInfo(){}

    public PageInfo(int currentPage, int pageSize, int totalCount, int currentCount){
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.currentCount = currentCount;
        pageCount = totalCount % 10 > 0 ? (totalCount/pageSize) + 1 : totalCount/pageSize;
    }

    public static PageInfo of(int currentPage, int pageSize, int totalCount, int currentCount){
        return new PageInfo(currentPage, pageSize, totalCount, currentCount);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
}
