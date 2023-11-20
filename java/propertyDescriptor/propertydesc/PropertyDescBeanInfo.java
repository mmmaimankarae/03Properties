package propertyDescriptor.propertydesc;
import java.beans.*;
import java.awt.*;
/* ตัวอย่างการทำงานแบบ 10-10-10 >> จะซ่อนProperty ของJPanel
 * ให้Client ใช้เท่าที่เราต้องการให้ใช้ */
public class PropertyDescBeanInfo extends SimpleBeanInfo {
   /* กำหนดว่าBeanClass คืออันไหน */
   private final static Class beanClass = PropertyDesc.class;
   public PropertyDescriptor[] getPropertyDescriptors() {
      try { /* สร้างObject Reference */
         PropertyDescriptor background = /* Link เข้ากับBeanClass */
                 new PropertyDescriptor( "Background", beanClass);
         PropertyDescriptor text =
                 new PropertyDescriptor( "Text", beanClass);
         background.setBound(true);
         text.setBound(true);
         /* ให้แสดงแค่Properties ที่แสดงเอาไว้ */
         PropertyDescriptor pv[] = {background, text};
         return pv;
      }
      catch (IntrospectionException e)
         { throw new Error(e.toString());
         }
   }
   /* สร้าง Icon ของตัว Bean >> สังเกตได้ที่Navigator JFrame */
   public Image getIcon(int iconKind) {
      if (iconKind == BeanInfo.ICON_COLOR_16x16) /* Use */
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
