package reflect;
import java.lang.reflect.*;

public class InvokeDemo {

  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Get reference to Method object
      int nparameters = args.length - 2;
      Class parameterTypes[] = new Class[nparameters];
      for(int i = 0; i < nparameters; i++) {
        parameterTypes[i] = double.class; //assume that all parameter type are double
      }
      Method m = c.getMethod(args[1], parameterTypes);

      // Generate parameters array
      Object parameters[] = new Double[nparameters];
      for(int i = 0; i < nparameters; i++) {
        parameters[i] = new Double(args[i + 2]);
      }

      // Invoke method
      Object r;
      if(Modifier.isStatic(m.getModifiers())) {
        r = m.invoke(null, parameters);
      }
      else {
        r = m.invoke(c.newInstance(), parameters);
      }

      // Display results
      System.out.println(r);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      