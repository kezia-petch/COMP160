//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  private String typeFace1 = "Times New Roman";
  private String typeFace2 = "Courier";
  
  private JRadioButton font1;
  private JRadioButton font2;
  private JRadioButton font3;
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  {
    font1 = new JRadioButton("Courier");
    font2 = new JRadioButton("Times New Roman");
    font3 = new JRadioButton("Helvetica");
    
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add (font1);
    sizeGroup.add (font2);
    sizeGroup.add (font3);
    
    setLayout(new GridLayout(6,1));
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    font1.addItemListener (listener);
    font2.addItemListener (listener);
    font3.addItemListener (listener);
    
    add (saying);
    add (bold);
    add (italic);
    add (font1);
    add (font2);
    add (font3);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 200));
  }
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style and changes the font of the phrase depending on the radio button pushed
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      if (font1.isSelected()){
        saying.setFont( new Font(typeFace = "Courier", style, 20));
      }
      else if (font2.isSelected()){
        saying.setFont( new Font(typeFace = "Times New Roman", style, 20));
      }
      else if (font3.isSelected()){
        saying.setFont( new Font(typeFace = "Helvetica", style, 20));
      }
      saying.setFont( new Font(typeFace, style, 20));
    }
  }
}
