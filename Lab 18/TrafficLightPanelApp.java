import javax.swing.*;
public class TrafficLightPanelApp{
  
  public static void main(String[]args){
    JFrame frame = new JFrame ("Traffic Light Panel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane() .add(new TrafficLightPanel());
    frame.pack();
    frame.setVisible(true);
  }
}