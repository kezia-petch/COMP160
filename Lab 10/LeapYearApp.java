/** Kezia Lab 10 COMP160
  * Determing if any year is a leap year due to specific calculations, using if else statements
  */

public class LeapYearApp{
  /**calling the leapYear method and inputting specific numbers as year values*/
  public static void main(String[]args){
    leapYear(2018);
    leapYear(2020);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
    
  }
  
  /**taking the parameter year and determing if it is a leap year my using its divisions of 4, 100 and 400*/
  public static void leapYear(int year){
    if (year<1582){
      System.out.println(year + ": predates the Gregorian calender");}
    else if (year % 4 != 0){
      System.out.println(year + ": is not a leap year");}
    else if (year % 4 == 0 && year % 100 != 0){
      System.out.println(year + ": is a leap year");}
    else if (year % 4 == 0 && year % 100 == 0 && year % 400 !=0){
      System.out.println(year + ": is not a leap year");}
    else if (year % 4 == 0 && year % 100 == 0 && year % 400 ==0){
      System.out.println(year + ": is a leap year");}
    
    
    
  }
}
