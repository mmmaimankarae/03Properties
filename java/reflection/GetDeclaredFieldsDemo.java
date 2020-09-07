package reflect;
import java.lang.reflect.*;

public class GetDeclaredFieldsDemo {
  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Display the declared fields
      Field fields[] = c.getDeclaredFields();
      for(int i = 0; i < fields.length; i++) {
        System.out.println(fields[i].getName());
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      