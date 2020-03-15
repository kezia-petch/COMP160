/** TablePanel extends JPanel - part of Diner program class
 * Lab 13 COMP160
 */
import java.awt.*;
import javax.swing.*;
public class TablePanel extends JPanel{
    Diner diner1;
    Diner diner2;
    Diner diner3;
    Diner diner4;
    Diner diner5;
    Diner diner6;
    /** Method calls the Diner constructor and sets the variables to the inputed parameters*/
    public TablePanel(){
    diner1 = new Diner (125, 20, "Yoda", 1);
    diner2 = new Diner (180, 75, "Luke", 2);
    diner3 = new Diner (180, 140, "Han", 3);
    diner4 = new Diner (125, 205, "Darth", 4);
    diner5 = new Diner (70, 140, "Leia", 5);
    diner6 = new Diner (70, 75, "Anakin", 6);
    setPreferredSize (new Dimension (300, 300));
    setBackground (Color.yellow);
    }
    /** draws each diner and draws the "table"*/ 
    public void paintComponent(Graphics g){
      super.paintComponent(g);
        diner1.draw(g);
        diner2.draw(g);
        diner3.draw(g);
        diner4.draw(g);
        diner5.draw(g);
        diner6.draw(g);
        g.setColor (Color.black);
        g.fillRect (125, 75, 50, 125);

    }
}