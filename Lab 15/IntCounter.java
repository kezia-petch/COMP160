/** IntCounter class - focusing on Arrays
 * Lab 15 COMP160
 */

public class IntCounter{
  int [] numArray;
  
  /** takes an array as the parameter and sets the variable to the parameter value, and displays every element of the array on the same
    * line with the array length at the end of the line */
  public IntCounter (int [] numArray){
    this.numArray = numArray;
    for (int number : numArray){
      System.out.print(number + " ");
    }
    System.out.println("Array is the length " + numArray.length);
  }
  
  /** Prints out a line stating where the target (inputted parameter) is present in the created array if the target is present */
  public void showTarget(int target){
    int count = 0;
    for (int i = 0; i < numArray.length; i++){
      if (numArray[i] == target){
        count++;
        System.out.println("\tThere is a " + target + " in position " + i);
      }
    }
    if (count == 0){
      System.out.println("\tThere are no " + target + "'s in this array");
    }
  }
}