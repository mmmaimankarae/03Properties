import java.lang.reflect.Method;
public class TestReflect {
  public static void main(String args[]) {
    try {

      // Get the class object
		String className = "javax.swing.JFrame";
      Class c = Class.forName(className);

      // Determine if it represents a class or interface
      if(c.isInterface()) {
        System.out.println(c.getName() + " is an interface");
      }
      else {
        System.out.println(c.getName() + " is not an interface");
		  Method[] methods = c.getMethods();
		  for(int i = 0; i < methods.length; i++) {
		  	System.out.println(methods[i].getName());
		  }
		  
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      