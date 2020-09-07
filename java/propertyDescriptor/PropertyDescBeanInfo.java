package propertydesc;

import java.beans.*;
import java.awt.*;

public class PropertyDescBeanInfo extends SimpleBeanInfo {
   private final static Class beanClass = PropertyDesc.class;
   public PropertyDescriptor[] getPropertyDescriptors() {
      try {
         PropertyDescriptor background =
                 new PropertyDescriptor( "Background", beanClass);
         PropertyDescriptor text =
                 new PropertyDescriptor( "Text", beanClass);
         background.setBound(true);
         text.setBound(true);
         PropertyDescriptor pv[] = {background, text};
         return pv;
      }
      catch (IntrospectionException e)
         { throw new Error(e.toString());
         }
   }

   public Image getIcon(int iconKind) {
      if (iconKind == BeanInfo.ICON_COLOR_16x16)
         { Image img = loadImage("star.gif");
           return img;
         }
      if (iconKind == BeanInfo.ICON_COLOR_32x32)
         { Image img = loadImage("wja.gif");
           return img;
         }
      return null;
   }
 }

