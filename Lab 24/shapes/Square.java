package shapes;
import java.awt.*;
/**
 * Square.java
 * Lab 23, COMP160  2019
 * draws a square
 */
public class Square extends Shape{
  public void display(Graphics g){
    g.setColor (colour);
    g.fillRect (x, y, width, height);
  }
}
    