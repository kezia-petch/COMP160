/** 
 * Lab 3, COMP160, 2019
 */
import java.util.Scanner;
public class Letter{
    private static String yours = "Yours sincerely";
    private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
    
    
    public static void main(String [] args){
        int junior = 25000;     // standard pay rate for Junior employee
        int intermediate = 35000;  // standard pay rate for Intermediate employee
        int senior = 50000;    // standard pay rate for Senior employee
        String name;
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter the successful applicant's name");
        name = scan.nextLine();
        jobOffer(name, "Cook", 50000);

    } // end method
    
    /** displays a job offer for Bottle Washer at $25K */
    public static void jobOffer(){
        System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
        signature();
    } // end method
    /** displays a job offer for any joba at any pay */
    public static void jobOffer(String jobTitle, int pay){
        System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + pay + " per annum.");
        signature();
  
    }
    /** displays a job offer for the inputed applicant for any job at any pay */
    public static void jobOffer(String applicant, String jobTitle, int pay){
        System.out.println("Dear " + applicant + "\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + pay + " per annum.");
        signature();
    }
    /** displays a signature at the end of every method it is called in*/
    public static void signature(){
      System.out.println(yours + "\n" + sign + "\n");
    }
} // end class