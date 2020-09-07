package propertydesc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class PropertyDesc extends JPanel implements Serializable {

   private JLabel l = new JLabel("A simple JLabel with raised border");
   private int width=200, height=100;

   public PropertyDesc() {
      setSize(width, height);
      setBackground(Color.yellow);
      l.setFont(new Font("TimesNewRoman", Font.BOLD, 20));
      l.setForeground(Color.red);
      l.setBorder(BorderFactory.createRaisedBevelBorder());
      add(l);
   }

   public void setText(String name) {
      l.setText(name);
   }

   public String getText() {
      return l.getText();
   }
}
