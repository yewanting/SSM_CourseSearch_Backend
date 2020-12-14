package cn.java.bean;/*
 * @Author:叶婉婷
 * @DATE:2020/12/1
 *
 */

public class TransCourseData {
    private String searchtext;
    private int curpage;
    private long pagesize;
    private String[]searchwebsite;
    private int isFree;
    private int isSort;
    private int minprice;
    private int maxprice;
    private String coursetotallabel;
    TransCourseData(){

    }
    public String getCoursetotallabel() {
        return coursetotallabel;
    }

    public void setCoursetotallabel(String coursetotallabel) {
        this.coursetotallabel = coursetotallabel;
    }

    public String getSearchText() {
        return searchtext;
    }

    public void setSearchText(String searchText) {
        this.searchtext = searchText;
    }

    public int getCurpage() {
        return curpage;
    }

    public void setCurpage(int curpage) {
        this.curpage = curpage;
    }

    public long getPagesize() {
        return pagesize;
    }

    public void setPagesize(long pagesize) {
        this.pagesize = pagesize;
    }

    public String[] getSearchwebsite() {
        return searchwebsite;
    }

    public void setSearchwebsite(String[] searchwebsite) {
        this.searchwebsite = searchwebsite;
    }

    public int getIsFree() {
        return isFree;
    }

    public void setIsFree(int isFree) {
        this.isFree = isFree;
    }

    public int getIsSort() {
        return isSort;
    }

    public void setIsSort(int isSort) {
        this.isSort = isSort;
    }

    public int getMinprice() {
        return minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    public int getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }


    public String toString(){
        return "searchtext = "+searchtext+" curpage = "+curpage+" pagesize = "+pagesize
                +"isFree = "+isFree+"isSort = "+isSort+"minprice = "+minprice+"maxprice = "+maxprice
                +"coursetotallabel = "+coursetotallabel;
    }
}
