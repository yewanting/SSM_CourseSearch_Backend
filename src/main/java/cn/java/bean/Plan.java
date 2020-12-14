package cn.java.bean;


public class Plan {

  private long id;
  private String date;
  private String content;
  private String ifSuccess;
  private String score;
  private String username;


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

}
