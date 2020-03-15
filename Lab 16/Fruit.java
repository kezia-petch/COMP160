/**Fruit class
 * Lab 16 COMP160
 * asks the user to fill the array of fruit and then gets the user to guess the fruits in turn 
 */

import java.util.Scanner;
public class Fruit{
  public static void main(String[]args){
    String [] fruits = new String [3];
    for (int i = 0; i < 3; i++){
    Scanner scan1 = new Scanner(System.in);
      System.out.println("What fruit do you want to add? ");
      String fruit1 = scan1.nextLine();
      fruits[i] = fruit1;
    }
    for (String fruit : fruits){
      Scanner scan2 = new Scanner(System.in);
      System.out.println("What fruit am i? " + fruit.substring(0, 2) + "          " + fruit.length() + " letters");
      String guess = scan2.nextLine();
      if (fruit.equals(guess)){
        System.out.println("Correct");
      }
      else {
        System.out.println("Try again");
      }   
    }
  }
}
  