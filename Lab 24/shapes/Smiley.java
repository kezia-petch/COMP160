package shapes;
import java.awt.*;
/**
 * Smiley.java
 * Lab 23, COMP160  2019
 * draws a Smiley
 */
public class Smiley extends Shape{
  public Smiley(){
    height = 30;
    width = height;
    
  }
  public void display(Graphics g){
    g.setColor (Color.yellow);
    g.fillOval (x, y, width, height);
    g.setColor (Color.black);
    g.fillOval (x+7, y+8, 4, 4);
    g.fillOval (x+20, y+8, 4, 4);
    g.drawArc (x+8, y+10, 15, 13, 190, 160);
  }
}