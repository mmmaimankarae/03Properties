import java.awt.*;
import java.io.*;
/* Main Program Save Object แบบDefault */
public class Save3 {
  public static void main(String args[]) {
    try { /* เขียนแบบPrimitive type */
      FileOutputStream fos;
      fos = new FileOutputStream("save3.data");
      ObjectOutputStream oos;
      oos = new ObjectOutputStream(fos);
      oos.writeInt(5);
      oos.writeDouble(Math.PI);
      oos.writeBoolean(true);
      oos.writeObject(Color.blue);
      oos.writeChar('a');
      oos.flush();
      fos.close();
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}
