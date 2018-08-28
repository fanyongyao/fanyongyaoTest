package com.jlt.analysis.common.helper;

public class ThreadLocalHelper {

    private static ThreadLocal<Integer> pageNum = new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();

    public static void setPageNum(Integer _pageNum) {
        pageNum.set(_pageNum);
    }

    public static Integer getPageNum() {
        return pageNum.get();
    }

    public static void removePageNum() {
        pageNum.remove();
    }

    public static void setPageSize(Integer _pageSize) {
        pageSize.set(_pageSize);
    }

    public static Integer getPageSize() {
        return pageSize.get();
    }

    public static void removePageSize() {
        pageSize.remove();
    }

}
