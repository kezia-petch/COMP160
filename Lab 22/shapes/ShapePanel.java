/**
 * ShapePanel.java
 * Lab 21, COMP160  2019
 * draws the randomly generated circles (up to 20) when a button is pressed
 */
package shapes;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShapePanel extends JPanel{
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private DrawingPanel drawPanel = new DrawingPanel();
  private Shape shape = new Shape();
  private int count = 0;
  private Shape [] shapes = new Shape [20];
  
  private JButton stop;
  private JButton start;
  Timer timer;
  private final int DELAY = 10;
  
  /**creating the layout of the GUI*/
  public ShapePanel(){
    controlPanel =  new JPanel();
    addShape = new JButton("Add Shape");
    countLabel = new JLabel("Count");
    showNum = new JTextField(2);
    
    stop = new JButton("Stop");
    start = new JButton("Start");
    
    controlPanel.setPreferredSize (new Dimension (100, 400));
    controlPanel.setBackground (Color.white);
    
    add (controlPanel);
    add (drawPanel);
    controlPanel.add (addShape);
    controlPanel.add (countLabel);
    controlPanel.add (showNum);
    
    controlPanel.add (start);
    controlPanel.add (stop);
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    stop.addActionListener(listener);
    start.addActionListener(listener);
    
    timer = new Timer (DELAY, listener);
  }
  
  /**creates the dimensions of the drawing panel*/

  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setPreferredSize (new Dimension (400, 400));
      setBackground (Color.pink);
    }
    
    /**draws the shape and puts it into an array and makes sure there are only up to 20 produced*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (int i = 0; i < count; i++){
        shapes[i].display(g);
      }
    }
  }

  private class ButtonListener implements ActionListener{
    Shape shape1 = new Shape();
    /**makes sure count is displayed and that there are only up to 20 circles produced
      * a new array is also created*/
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == timer){
        for (int i = 0; i < count; i++){
        shapes[i].move();
        }
      }
      else if (event.getSource() == start){
        timer.start();
      }
      else if (event.getSource() == stop){
        timer.stop();
      }
      else if (event.getSource() == addShape && count < shapes.length){
        shapes [count] = new Shape ();
        count++;
        String count1 = Integer.toString(count);
        showNum.setText(count1);
      }
      repaint();
    }
  }
}
