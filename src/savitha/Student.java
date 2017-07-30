package savitha;

public class Student {
  
  public Student(long id, String firstName, String lastName, String gender, int age) {
  
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = age;
  }
      private long id; 
      private String firstName;
      private String lastName;
      private String gender;
      private int age;
      public long getId() {
        return id;
      }
      public String getFirstName() {
        return firstName;
      }
      public String getLastName() {
        return lastName;
      }
      public String getGender() {
        return gender;
      }
      public int getAge() {
        return age;
      }
      public void setId(long id) {
        this.id = id;
      }
      public void setFirstName(String firstName) {
        this.firstName = firstName;
      }
      public void setLastName(String lastName) {
        this.lastName = lastName;
      }
      public void setGender(String gender) {
        this.gender = gender;
      }
      public void setAge(int age) {
        this.age = age;
      }
      @Override
      public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
      }

}
