import java.util.Scanner;
public class EnterStrApp{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sentence = scan.nextLine();
    int i = 0;
    int vowelCount = 0;
    int consCount = 0;
    while (i < sentence.length()){
      if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'||'A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z'){
        switch (sentence.charAt(i)){
          case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U': 
            vowelCount++;
            break;
          default:
            consCount ++;
        }
        
      }
      i++;
    }
    System.out.println(sentence);
    System.out.println("The number of vowels: " + vowelCount);
    System.out.println("The number of consonants: " + consCount);
  }
}
