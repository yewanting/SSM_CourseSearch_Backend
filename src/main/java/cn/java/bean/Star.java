package cn.java.bean;



public class Star {

  private long id;
  private String username;
  private String courseid;
  private Coursetable coursetable;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getCourseid() {
    return courseid;
  }

  public void setCourseid(String courseid) {
    this.courseid = courseid;
  }

  public Coursetable getCoursetable() {
    return coursetable;
  }

  public void setCoursetable(Coursetable coursetable) {
    this.coursetable = coursetable;
  }

  public String toString()
  {
    return "Star : id :"+id+" username :"+username +" courseid :"+courseid +" coursetable :"+coursetable;
  }
}
