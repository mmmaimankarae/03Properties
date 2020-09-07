package reflect;

public class IsInterfaceDemo {
  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Determine if it represents a class or interface
      if(c.isInterface()) {
        System.out.println(args[0] + " is an interface");
      }
      else {
        System.out.println(args[0] + " is not an interface");
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      