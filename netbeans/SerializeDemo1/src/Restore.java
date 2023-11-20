//package version;
import java.io.*;
/* อ่านไฟล์ขึ้นมาแบบDefault */
public class Restore {
  public static void main(String args[]) {
    try {
      /* เปิดไฟล์ */
      FileInputStream fis = new FileInputStream("save1.data");
      /* สร้างObject ของClass ObjectInputStream */
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
