/** FilePanel.java
  * Lab 20, COMP160,  2019
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  private boolean fill1;
  private Color colour1;
  
  /**constructor defines 6 rectangle objects and determines the colour and 
    * fill of the rectangle based on the values of specific vairables 
    * and draws up to 10 rectangles depending on the data within the file */
  public FilePanel(){  
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    String fileName = "LongBadData.txt";
    
    try{
      Scanner fileScan = new Scanner(new File(fileName));
      while (fileScan.hasNextLine() && count < drawObjects.length){
        String inputLine = fileScan.nextLine();
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner lineScan = new Scanner(inputLine);
          int fill = (lineScan.nextInt());
          boolean fill1;
          Color colour1;
          if (fill == 1){
            fill1 = true;
          }
          else {
            fill1 = false;
          }
          int colour = (lineScan.nextInt());
          if (colour == 1){
            colour1 = Color.red;
          }
          else if (colour == 2){
            colour1 = Color.blue;
          }
          else {
            colour1 = Color.green;
          }
          int x = (lineScan.nextInt());
          int y = (lineScan.nextInt());
          int width = (lineScan.nextInt());
          int height = (lineScan.nextInt());
          drawObjects[count] = new Rectangle(fill1, colour1, x, y, width, height);
          count++;
        }
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location");
      System.exit(1);
    }
  }
  
  /**each Rectangle will draw itself
  @param g a Graphics object*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
