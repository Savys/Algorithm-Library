package savitha;

import java.util.ArrayList;
import java.util.List;

public class Congress {
  private List<Person> people;
  
  public Congress()
  {
    people=new ArrayList<>();
   }
  public void add(Person person){
    people.add(person);
  }
  public String toString(){
    StringBuilder result=new StringBuilder();
    for(Person person:people){
      result.append(person.toString()+"\n");
    }
    return result.toString();
    
  }
}
