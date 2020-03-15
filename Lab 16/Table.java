/**Table class
 * Lab 16 COMP160
 * Draws a table of 12 by 12, thats multiplies the cols by the rows 
 */

public class Table{
  public static void main(String[]args){
    int [] [] table = new int [12] [12];
    for (int row = 0; row < table.length; row++){
      for (int col = 0; col < table[row].length; col++){
        table [row][col] = (row +1) * (col +1);
      }
    }
    
    for (int [] row : table){
      for (int col : row){
        System.out.print(col + "\t");
      }
      System.out.println();
    }
        
  }
}