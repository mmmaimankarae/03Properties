//package version;
import java.io.*;
/* อ่านไฟล์กลับขึ้นมาแบบDefault */
public class Restore {
  public static void main(String args[]) {
    try {
      FileInputStream fis = new FileInputStream("save2.data");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Object obj = ois.readObject();
      fis.close();
      System.out.println(obj);
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}
