/** Song class for Customer.java
 * Lab 11 COMP160
 */
public class Song{
  String songLine;
  /**using a constructor to define the variable songLine*/ 
  public Song (String sLine){
    songLine = sLine;
  }
  /**returning the string variable songLine*/ 
  public String toString(){
    return songLine;
  }
  /**using methods to manipulate songLine and print out the new values*/ 
  public void process(){
    System.out.println("Length is: " + songLine.length());
    System.out.println("Last character is: " + songLine.charAt(songLine.length() - 1));
    
    int first_space = songLine.indexOf(' ');
    int second_space = songLine.indexOf(' ', (first_space + 1));
    if (second_space != -1){
    System.out.println("First 2 words: " + songLine.substring(0, second_space) + '\n' + "Remaining words: " + songLine.substring((second_space + 1), songLine.length()));
    System.out.println("First letter of the third word: " + songLine.charAt(second_space + 1));
    }
    
    System.out.println("Song Line in upper case: " + songLine.toUpperCase());
    System.out.println("Song Line using 'x' instead of ' ': " + songLine.replace(' ', 'x'));
    System.out.println("Index number of the first b: " + songLine.indexOf('b'));
    System.out.println("Song Line: " + songLine);
    }
}
    