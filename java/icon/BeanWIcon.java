//A simple bean with superclass Canvas

package icon;

import java.awt.*;
import java.io.*;

public class BeanWIcon extends Canvas implements Serializable {
   public BeanWIcon() {
      setSize(60, 50);
   }

   public void paint(Graphics g) {
      g.drawOval(5,5,50,30);
      g.drawOval(12,12,15,8);
      g.drawOval(30,12,15,8);
      g.fillOval(19,12,8,8);
      g.fillOval(37,12,8,8);
      g.drawArc(22,20,16,8,180,180);
      g.drawString("Hello!", 16, 45);
   }
}
