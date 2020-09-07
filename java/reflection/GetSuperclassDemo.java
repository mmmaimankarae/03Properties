package reflect;

public class GetSuperclassDemo {

  public static void main(String args[]) {
    try {

      // Get the class object
      Class c = Class.forName(args[0]);

      // Display all the superclasses
      while(true) {
        System.out.println(c);
        if((c = c.getSuperclass()) == null) {
          break;
        }
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
      