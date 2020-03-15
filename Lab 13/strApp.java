/** StrApp class
 * Lab 13 COMP160
 */
import java.util.Scanner;
public class strApp{
  /** Main method which creates two Scanner objects allowing the */
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first phrase: ");
    String phrase = scan.nextLine();
    phrase = phrase.toLowerCase();
    String phraseNew1 = sort(phrase);
    
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Enter second phrase: ");
    String phrase2 = scan.nextLine();
    phrase2 = phrase2.toLowerCase();
    String phraseNew2 = sort(phrase2);
    System.out.println(phraseNew2 + " are the letters of " + phrase2 + " in order");
    System.out.println(phraseNew1 + " are the letters of " + phrase + " in order");
    if (phraseNew2.equals(phraseNew1)){
      System.out.println(phrase + " is an anagram of " + phrase2);
    }
  }
  public static String sort(String phrase){
    String phraseNew = "";
    for (char c = 'a' ; c <= 'z'; c++){
      for (int i = 0; i < phrase.length(); i++){
        if (phrase.charAt(i) == c){
          phraseNew += c;
        }
      }
    }
      return phraseNew;
  }
}


        