import java.awt.*;
import java.io.*;
import java.util.*;
/* Main Program Save Object แบบDefault */
public class Save2 {
  public static void main(String args[]) {
    try {
      Vector v = new Vector();
      v.addElement(new Person("Joe", "7834"));
      v.addElement(new Person("Claire", "6550"));
      v.addElement(new Person("Viviane", "2323"));
      System.out.println(v);
      FileOutputStream fos;
      fos = new FileOutputStream("save2.data");
      ObjectOutputStream oos;
      oos = new ObjectOutputStream(fos);
      oos.writeObject(v);
      oos.flush();
      fos.close();
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}
