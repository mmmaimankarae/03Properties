package reflect;
import java.lang.reflect.*;

public class GetMethodsDemo {

  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Display the methods
      Method methods[] = c.getMethods();
      for(int i = 0; i < methods.length; i++) {
        System.out.println(methods[i].getName());
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      