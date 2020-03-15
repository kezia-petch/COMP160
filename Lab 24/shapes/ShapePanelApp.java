/**
 * ShapePanelApp.java
 * Lab 24, COMP160  2019
 * Runs the ShapePanel class and makes sure it closes when exited
 */
package shapes;
import javax.swing.*;
public class ShapePanelApp{
  
  public static void main(String[]args){
    JFrame frame = new JFrame ("Shape Panel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane() .add(new ShapePanel());
    frame.pack();
    frame.setVisible(true);
  }
}