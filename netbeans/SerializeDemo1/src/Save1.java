import java.awt.*;
import java.io.*;
import java.util.*;

public class Save1 {
  public static void main(String args[]) {
    try {
      Vector v = new Vector();
      v.addElement(new Integer(-7));
      v.addElement(new Rectangle(20, 20, 100, 50));
      v.addElement("Hello");
      System.out.println(v);
      FileOutputStream fos;
      fos = new FileOutputStream("save1.data");
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
