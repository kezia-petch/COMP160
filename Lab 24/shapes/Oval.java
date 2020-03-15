package shapes;
import java.awt.*;
/**
 * Oval.java
 * Lab 23, COMP160  2019
 * draws a oval
 */
public class Oval extends Shape{
  public Oval(){
    height = (4 * width);
    y = (randomRange(0, 400 - height));
  }
  public void display(Graphics g){
    g.setColor (colour);
    g.fillOval (x, y, width, height);
  }
}
