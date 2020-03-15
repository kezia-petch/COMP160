import java.util.Scanner;
public class Customer{
  /**set variables*/
  String name;
  boolean child;
  boolean student;
  boolean booked;
  
  /**constructor taking in set variables and age to defin child variable*/
  public Customer (String nameIn, int age, boolean studentIn){
    name = nameIn;
    student = studentIn;
    child = age >= 5 && age <= 16;
  }
  /**setting and returning name*/
  public String getName(){
    return name;
  }
  /**setting and returning child*/
  public boolean isChild(){
    return child;
  }
  /**setting and returning student*/
  public boolean isStudent(){
    return student; 
  }
  /**setting and returning booked*/
  public boolean isBooked(){
    return booked;
  }
  /**setting booked as true*/
  public void setBooked(){
    booked = true;
    
  }
}