public class Person{
  private String name;
  public static int total;
  public Person (String n){
    name = n;
    total++;
  }
  
  public String getName(){
    return name;
  }
}