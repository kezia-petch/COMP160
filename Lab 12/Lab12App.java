import java.util.Scanner;
public class EnterNumApp{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter and integer greater than 1:");
    int num = scan.nextInt();
    int i = 2;
    int sumnum = 0; 
    if (num < 2){
      System.out.println("Input value must not must be less than 2");}
    
    while (i <= num){
      if (i % 2 == 0){
        sumnum += i;
      }
        i++;
    }
    System.out.println("Sum of the even numbers between 2 and " + num + " inclusive is: " + sumnum); 
  }
 }

