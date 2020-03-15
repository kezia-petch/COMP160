public class PersonCounter{
  public static void main(String [] args){
    Person a = new Person ("Astrid");
    Person b = new Person ("Bjorn");
    Person c = a;
    System.out.println (a.getName() + b.getName() + c.getName());
    System.out.println (Person.total);
  }
}

      