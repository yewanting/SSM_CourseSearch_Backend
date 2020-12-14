package cn.java.bean;/*
 * @Author:叶婉婷
 * @DATE:2020/12/2
 *
 */

public class TransMultiData {
    private String searchText;
    private String token;
    private String courseid;
    private String luntanNames[];
    private int curpage;
    private long id;
    private String date;
    private String content;
    private String ifSuccess;
    private String score;
    private String username;
    private String whoAdd;
    private String addTime;
    private String luntanName;
    private String entertime;


    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }


    public String[] getLuntanNames() {
        return luntanNames;
    }

    public void setLuntanNames(String[] luntanName) {
        this.luntanNames = luntanNames;
    }


    public int getCurpage() {
        return curpage;
    }

    public void setCurpage(int curpage) {
        this.curpage = curpage;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIfSuccess() {
        return ifSuccess;
    }

    public void setIfSuccess(String ifSuccess) {
        this.ifSuccess = ifSuccess;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWhoAdd() {
        return whoAdd;
    }

    public void setWhoAdd(String whoAdd) {
        this.whoAdd = whoAdd;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getLuntanName() {
        return luntanName;
    }

    public void setLuntanName(String luntanName) {
        this.luntanName = luntanName;
    }

    public String getEntertime() {
        return entertime;
    }

    public void setEntertime(String entertime) {
        this.entertime = entertime;
    }
}
