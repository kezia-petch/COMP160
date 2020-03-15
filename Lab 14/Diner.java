/** Diner class
 * Lab 14 COMP160
 */
import java.awt.*;
import javax.swing.*;
public class Diner{
  int x;
  int y;
  String name;
  int seatNum;
  Color colour;
  final int DIAMETER = 50;
  /** constructor that sets the variables to the input parameters - also determines the colour of the dinner by number*/
  public Diner (int x, int y, String name, int seatNum){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    if (seatNum % 2 == 0){
      colour = Color.gray;}
    else {
      colour = Color.white;}
  }
  /** draws circle, sets colour of circle and draws both strings and sets their colours and fonts*/
  public void draw(Graphics g){
    g.setColor (colour);
    g.fillOval (x, y, DIAMETER, DIAMETER);
    g.setColor (Color.black);
    g.setFont( new Font("Helvetica", Font.BOLD, 12));
    g.drawString(name, x+6, y+30);
    g.setFont( new Font("Helvetica", Font.BOLD, 10));
    g.drawString(Integer.toString(seatNum), x+22, y+12);
  }
}