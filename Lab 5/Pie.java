import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2019 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      /** creates variables that can be used throughout the program*/
      final int XLOC = 40;
      final int YLOC = 10;
      final int RECT = 175;
      final int WIDTH = 45;
      /** creates cyan segment*/
      page.setColor (Color.cyan);
      page.fillArc(XLOC, YLOC, RECT, RECT, 45, WIDTH);
      /** creates red segment*/
      page.setColor (Color.red);
      page.fillArc(XLOC, YLOC, RECT, RECT, 90, WIDTH);
      /** creates blue segment*/
      page.setColor (Color.blue);
      page.fillArc(XLOC, YLOC, RECT, RECT, 135, WIDTH);
      /** creates yellow segment*/
      page.setColor (Color.yellow);
      page.fillArc(XLOC, YLOC, RECT, RECT, 180, WIDTH);
      /** creates green segment*/
      page.setColor (Color.green);
      page.fillArc(XLOC, YLOC, RECT, RECT, 225, WIDTH);
      /** creates black segment*/
      page.setColor (Color.black);
      page.fillArc(XLOC, YLOC, RECT, RECT, 270, WIDTH);
      /** creates orange segment*/
      page.setColor (Color.orange);
      page.fillArc(XLOC, YLOC, RECT, RECT, 315, WIDTH);
      /** causes the extension of a pink segment out of the pie chart*/
      page.setColor (Color.pink);
      page.fillArc(45, 1, 185, 185, 0, WIDTH);
     
    }
}
