/** DinerApp class
 * Lab 14 COMP160
 */
import javax.swing.*;
public class DinerApp{
  /** makes sure the graphic is drawn by creating a new instance of TablePanel and determines when the graphic closes*/
  public static void main(String[]args){
    JFrame frame = new JFrame ("Seating Plan");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane() .add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}