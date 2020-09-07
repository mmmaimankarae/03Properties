//The BeanInfo class for the bean inheriting from Canvas
//Just display an icon

package icon;

import java.beans.*;
import java.awt.*;

public class BeanWIconBeanInfo extends SimpleBeanInfo {
   public Image getIcon(int iconKind) {
      if (iconKind == BeanInfo.ICON_COLOR_16x16) {
         Image img = loadImage("wja.gif");
         return img;
      }
      if (iconKind == BeanInfo.ICON_COLOR_32x32) {
         Image img = loadImage("wja.gif");
         return img;
      }
      return null;
   }
}

