/** IntCounterApp class
 * Lab 15 COMP160
 */

import java.util.Scanner;
import java.util.Random;
public class IntCounterApp{
  /**Uses scanner to ask the user to input a target (3 times), inputs the array created from makeArray into the constructor and calls
    * show target on the inputed target */
  public static void main(String[]args){
    for (int i = 0; i < 3; i++){
      Scanner scan = new Scanner(System.in);
      System.out.println("Which number do you wish to find? ");
      int targetInt = scan.nextInt();
      IntCounter num1 = new IntCounter(makeArray());
      num1.showTarget(targetInt);
      
    }
    System.out.println("Finished");
  }
   /** Creates an array of random size between 5 and 10, fills the array with random values between 0 and 4 then returns the array */
   public static int [] makeArray(){
      Random rand = new Random();
      int [] array = new int [rand.nextInt(6) + 5];
      for (int i = 0; i < array.length; i++){
        array[i] = rand.nextInt(5);
      }
      return array;
    }
}

