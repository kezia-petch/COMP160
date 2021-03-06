/** application class for Customer.java
 * Lab 9 COMP160
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class CruiseApp{
    
    public static void main(String[]args){
        /**each Customer created with name, age, showed student ID card*/
        Customer customer1 = new Customer("Aaron Stott",17, true);
        Customer customer2 = new Customer("Betty Adams",17, false);
        Customer customer3 = new Customer("Corin Child",16, true);
        Customer customer4 = new Customer("Doris Stewart",25, true);
        Customer customer5 = new Customer("Edmond Cheyne",12, false);
        Customer customer6 = new Customer("Fiona Chaney",7, false);
        Customer customer7 = new Customer("Ged Still-Child",16, true);
        Customer customer8 = new Customer("Harry Adamson",20, false);
        /**calling confirmedBooking for each created customer*/
        confirmBooking(customer1); 
        confirmBooking(customer2);
        confirmBooking(customer3); 
        confirmBooking(customer4);
        confirmBooking(customer5); 
        confirmBooking(customer6);
        confirmBooking(customer7); 
        confirmBooking(customer8);
        /**calling showBooked for each created customer*/
        showBooked(customer1); 
        showBooked(customer2); 
        showBooked(customer3); 
        showBooked(customer4); 
        showBooked(customer5); 
        showBooked(customer6); 
        showBooked(customer7); 
        showBooked(customer8); 
    }
    
    
    /***/
    public static void confirmBooking (Customer customer){
      DecimalFormat fmt = new DecimalFormat ("0.00");
      double ticketPrice = 56.0;
      double mealPrice = 30.0;
      
      if (customer.isChild()){
        ticketPrice = (ticketPrice*0.5);
        mealPrice = (mealPrice*0.5);
      }
      /**if customer is a student do a specific calculation to determine price of ticket and meal*/
      else if (customer.isStudent()){
        ticketPrice = (ticketPrice*0.5);
        mealPrice = (mealPrice*0.9);
      }
      /**else do a specific (general) calculation to determine price of ticket and meal*/
      else{
      ticketPrice = (ticketPrice*0.8);
        mealPrice = (mealPrice*0.9);
      }
      /**scan input from a user to determine if a booking is confirmed or not*/
      Scanner scan =new Scanner(System.in);
      System.out.println(customer.getName() + "\n" + "Ticket price: $" + fmt.format(ticketPrice) + "\n" + "Meal price: $" +
                         fmt.format(mealPrice) + "\n" + "Total price: $" + fmt.format((ticketPrice+mealPrice)) + "\n" + "Confirm booking for " + customer.getName() + " (Y/N)" + "\n");
      String next = scan.nextLine();
      /**if the booking is confimed set booked to true and print out booked*/
      if (next.equals("Y")){
        customer.setBooked();
        System.out.println("Booked");}
      else if (next.equals("y")){
        customer.setBooked();
        System.out.println("Booked");}
      /**if the booking is NOT confimed print out error/not booked*/
      else System.out.println("Error/Not booked");
    }
    
    /**compile a list of the customers that have a confirmed bookingy*/
    public static void showBooked(Customer customer){
      if (customer.isBooked()){
        System.out.println(customer.getName() + " is booked");}
      else {System.out.println("");}
    }
    
}
