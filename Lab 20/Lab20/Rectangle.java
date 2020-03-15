import java.awt.*;
/* Rectangle.java
 * Lab 20, COMP160,  2019
 * 
 * graphical representation of a rectangle
 * with a fill, colour, x, y, width, height
 */

public class Rectangle{
  private static int totalCount; // count of the amount of rectangles drawn
  private int thisCount; // determines what number rectangle is drawn
  private int x;  // x location;
  private int y;  // y location;
  private Color shade;  // colour of Rectangle
  private int width; // width of Rectangle
  private int height;// height of Rectangle
  private boolean fill; // drawRect false or fillRect true
  
  
  /**constructor for Rectangle*/
  public Rectangle(boolean fill, Color shade,int x, int y , int width, int height){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.shade = shade;
    this.fill=fill;
    totalCount++;
    thisCount = totalCount;
  }
  
 /**draw this rectangle
 @param g a Graphics object*/
    public void draw(Graphics g){
        g.setColor(shade);
        if (fill ){
            g.fillRect(x, y, width, height);
        } else  {
            g.drawRect(x, y, width, height);
        }
        g.setColor(Color.black);
        g.setFont( new Font("Helvetica", Font.BOLD, 11));
        g.drawString(thisCount + "of" + totalCount, x, y);
    }
  
}

