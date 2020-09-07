package pie;
import java.beans.*;

public class PieBeanInfo extends SimpleBeanInfo {

  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Pie.class, 
      PieCustomizer.class);
  }
}