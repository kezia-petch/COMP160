/**
 * ShapePanel.java
 * Lab 23, COMP160  2019
 * draws the randomly generated shapes (up to 20) when a button is pressed
 */
package shapes;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class ShapePanel extends JPanel{
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private DrawingPanel drawPanel = new DrawingPanel();
  private Shape shape = new Circle();
  private int count = 0;
  private ArrayList <Shape> shapes = new ArrayList <Shape>();
  
  private JButton [] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), 
    new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")};
  
  private JButton stop;
  private JButton start;
  Timer timer;
  private final int DELAY = 10;
  
  /**creating the layout of the GUI*/
  public ShapePanel(){
    controlPanel =  new JPanel();
    countLabel = new JLabel("Remove Which?");
    showNum = new JTextField(2);
    
    controlPanel.setPreferredSize (new Dimension (100, 400));
    controlPanel.setBackground (Color.white);
    
    add (controlPanel);
    add (drawPanel);
    controlPanel.add (countLabel);
    controlPanel.add (showNum);
    
    ButtonListener listener = new ButtonListener();
    
    timer = new Timer (DELAY, listener);
    
    for (JButton button : buttons){
      button.addActionListener(listener);
      controlPanel.add (button);
    }
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
      for (int i = 0; i < shapes.size(); i++){
        shapes.get(i).display(g);
        shapes.get(i).showIndex(g, i);
      }
    }
  }
  
  private class ButtonListener implements ActionListener{
    Shape shape1 = new Circle();
    
    /**draws a shape based on what button the user has pressed
      * makes sure count is displayed and that there are only up to 20 shapes produced
      * a new array is also created*/
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == timer){
        for (int i = 0; i < shapes.size(); i++){
          shapes.get(i).move();
        }
      }
      else{
        JButton button = (JButton) event.getSource();
        if (button.getText().equals("Circle")){
          shapes.add(new Circle ());
          
        }
        else if (button.getText().equals("Square")){
          shapes.add(new Square ());
          
        }
        else if (button.getText().equals("Oval")){
          shapes.add(new Oval ());
          
        }
        else if (button.getText().equals("Smiley")){
          shapes.add(new Smiley ());
          
        }
        else if (button.getText().equals("Swirl")){
          shapes.add(new Swirl ());
          
        }
        else if (button.getText().equals("Start")){
          timer.start();
        }
        else if (button.getText().equals("Stop")){
          timer.stop();
        }
        else if (button.getText().equals("Remove")){
          try{
            int numStore = Integer.parseInt(showNum.getText());
            shapes.remove(numStore);
          }
          catch(NumberFormatException e){
            System.out.println("Nothing is there to remove, Try adding some shapes");
          }
          catch(IndexOutOfBoundsException b){
            System.out.println("That number is too big, Try something smaller");
          }
        }
        String count1 = Integer.toString(shapes.size()-1);
        if (shapes.size() == 0){
          showNum.setText(" ");
        }
        else{
          showNum.setText(count1);
        }
      }
      repaint();
    }
  }
}

