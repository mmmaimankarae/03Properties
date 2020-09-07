package reflect;
import java.lang.reflect.*;

public class ModifierDemo {

  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Display each method name and its modifiers
      Method methods[] = c.getMethods();
      for(int i = 0; i < methods.length; i++) {
        System.out.print(methods[i].getName() + ": ");
        System.out.print(Modifier.toString(methods[i].getModifiers()));
        System.out.println();
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      