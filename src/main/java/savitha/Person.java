package savitha;

public class Person {
  private String Fname;
  private String Lname;
  private String title;
  private String bday;

  public String getFname() {
    return Fname;
  }

  public String getLname() {
    return Lname;
  }

  public String getTitle() {
    return title;
  }

  public String getBday() {
    return bday;
  }

  public void setFname(String fname) {
    Fname = fname;
  }

  public void setLname(String lname) {
    Lname = lname;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setBday(String bday) {
    this.bday = bday;
  }

  private Person(String Fname, String Lname) {
    this.Fname = Fname;
    this.Lname = Lname;
  }
  public String toString(){
    return Fname + " " +Lname + "  "+title + "" +bday;
    
  }
}
