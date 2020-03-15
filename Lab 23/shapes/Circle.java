package shapes;
import java.awt.*;
/**
 * Circle.java
 * Lab 23, COMP160  2019
 * draws a circle
 */
public class Circle extends Shape{
  public void display(Graphics g){
    g.setColor (colour);
    g.fillOval (x, y, width, height);
  }
}

    

  