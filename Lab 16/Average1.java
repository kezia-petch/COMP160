/**Average class
  * Lab 16 COMP160
  * takes the averages of each token within the array and turns it 
  */
public class Average1{
  public static void main(String[]args){
    int [] [] table = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
    for (int [] row : table){
      int count = 0;
      for (int col : row){
       count += col;
        System.out.print(col + " ");
      }
      System.out.println("\tAverage : " + (double)count/row.length);
    }
  }
}
