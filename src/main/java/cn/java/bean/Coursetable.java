package cn.java.bean;


public class Coursetable {

  private long id;
  private String coursetitle;
  private String coursedes;
  private String coursevediohref;
  private String coursesourse;
  private long courseprice;
  private String courseimghref;
  private String courselabel;
  private String courselevel;
  private long coursenumber;
  private String coursetotallabel;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCoursetitle() {
    return coursetitle;
  }

  public void setCoursetitle(String coursetitle) {
    this.coursetitle = coursetitle;
  }


  public String getCoursedes() {
    return coursedes;
  }

  public void setCoursedes(String coursedes) {
    this.coursedes = coursedes;
  }


  public String getCoursevediohref() {
    return coursevediohref;
  }

  public void setCoursevediohref(String coursevediohref) {
    this.coursevediohref = coursevediohref;
  }


  public String getCoursesourse() {
    return coursesourse;
  }

  public void setCoursesourse(String coursesourse) {
    this.coursesourse = coursesourse;
  }


  public long getCourseprice() {
    return courseprice;
  }

  public void setCourseprice(long courseprice) {
    this.courseprice = courseprice;
  }


  public String getCourseimghref() {
    return courseimghref;
  }

  public void setCourseimghref(String courseimghref) {
    this.courseimghref = courseimghref;
  }


  public String getCourselabel() {
    return courselabel;
  }

  public void setCourselabel(String courselabel) {
    this.courselabel = courselabel;
  }


  public String getCourselevel() {
    return courselevel;
  }

  public void setCourselevel(String courselevel) {
    this.courselevel = courselevel;
  }


  public long getCoursenumber() {
    return coursenumber;
  }

  public void setCoursenumber(long coursenumber) {
    this.coursenumber = coursenumber;
  }


  public String getCoursetotallabel() {
    return coursetotallabel;
  }

  public void setCoursetotallabel(String coursetotallabel) {
    this.coursetotallabel = coursetotallabel;
  }



  public String toString()
  {
    return "Coursetable[ id = "+id+" coursetitle = "+coursetitle+" coursedes = "+coursedes+" coursetotallabel = "+coursetotallabel+"]";
  }
}
