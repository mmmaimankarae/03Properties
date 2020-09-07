package reflect;
import java.lang.reflect.*;

public class ArrayDemo {

  public static void main(String args[]) {
    try {

      // Get the Class object
      Class c = Class.forName(args[0]);

      // Get the constructor that accepts String objects
      Class parameterTypes[] = new Class[1];
      parameterTypes[0] = String.class;
      Constructor constructor;
      constructor = c.getConstructor(parameterTypes);

      // Create the array
      Object a = Array.newInstance(c, args.length - 1);

      // initialize the elements of the array
      Object cargs[] = new Object[1];
      for(int i = 1; i < args.length; i++) {
        cargs[0] = args[i];
        Object object = constructor.newInstance(cargs);
        Array.set(a, i - 1, object);
      }

      // Get and display the elements of the array
      int length = Array.getLength(a);
      System.out.println("The array length is " + length);
      for(int i = 0; i < length; i++) {
        Object object = Array.get(a, i);
        System.out.println("Entry " + i + "=" + object);
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
        