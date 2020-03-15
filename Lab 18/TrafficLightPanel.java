/** TrafficLightPanel extends JPanel - part of Diner program class
 * Lab 18 COMP160
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel{
  private JButton redButton;
  private JButton greenButton;
  private JButton amberButton;
  private JLabel lastPressedLabel;
  private JPanel buttonPanel;
  
  public TrafficLightPanel(){
    buttonPanel =  new JPanel();
    greenButton = new JButton("Red");
    amberButton = new JButton("Amber");
    redButton = new JButton("Green");
    lastPressedLabel = new JLabel("Last Pressed");
    
    setPreferredSize (new Dimension (200, 300));
    setBackground (Color.blue);
    
    buttonPanel.setPreferredSize (new Dimension (80, 290));
    buttonPanel.setBackground (Color.white);
    
    buttonPanel.add (greenButton);
    buttonPanel.add (amberButton);
    buttonPanel.add (redButton);
    buttonPanel.add (lastPressedLabel);
    add (buttonPanel);
    
    ButtonListener listener = new ButtonListener();
    greenButton.addActionListener(listener);
    amberButton.addActionListener(listener);
    redButton.addActionListener(listener);
    
    LightPanel lightPanel = new LightPanel();
    add (lightPanel);
  }
  
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed (ActionEvent event){
      if (event.getSource() == redButton){
        lastPressedLabel.setText ("Red");
        
      }
      else if (event.getSource() == greenButton){
        lastPressedLabel.setText ("Green");
        
      }
      else if (event.getSource() == amberButton){
        lastPressedLabel.setText ("Amber");
        
      }
      repaint();
    }
  }
  
  private class LightPanel extends JPanel{
    public LightPanel(){
      setPreferredSize (new Dimension (80, 290));
      setBackground (Color.cyan);
    }
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor (Color.black);
      g.fillOval (20, 30, 40, 40);
      g.fillOval (20, 80, 40, 40);
      g.fillOval (20, 130, 40, 40);
      if (lastPressedLabel.getText() == "Red"){
        g.setColor (Color.red);
        g.fillOval (20, 30, 40, 40);
      }
      else if (lastPressedLabel.getText() == "Amber"){
        g.setColor (Color.orange);
        g.fillOval (20, 80, 40, 40);
      }
      else if (lastPressedLabel.getText() == "Green"){
        g.setColor (Color.green);
        g.fillOval (20, 130, 40, 40);
      }
    }
  }
}



