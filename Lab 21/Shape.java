import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 * Shape.java
 * Lab 21, COMP160  2019
 * Sets variables as a random number based on a specific range set by randomRange
 */

public class Shape{
  int x;
  int y;
  int width;
  int height;
  Color colour;
  
  /**sets data fields as random numbers between the range shown
    * uses randomRange to generate these random numbers*/
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = (randomRange(0, 400 - width));
    y = (randomRange(0, 400 - height));
    colour = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
  }
  
  
  /** Returns random integer between high and low parameters.
    @param low lowest value of range required
    @param high highest value of range required
    @return a random integer between low and high values 
    */
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }
  
  
  /**draws the randomly generated circle*/
  public void display(Graphics g){
    g.setColor (colour);
    g.fillOval (x, y, width, height);
  }
}
