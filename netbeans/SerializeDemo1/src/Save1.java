import java.awt.*;
import java.io.*;
import java.util.*;
/* Main Program เพื่อใช้ในการเขียนข้อมูลObject ลงไปในไฟล์ แบบDefault */
public class Save1 {
  public static void main(String args[]) {
    try {
      Vector v = new Vector(); /* เก็บข้อมูลเป็น vector Object */
      v.addElement(new Integer(-7));
      v.addElement(new Rectangle(20, 20, 100, 50));
      v.addElement("Hello");
      System.out.println(v);
      FileOutputStream fos; /* Create file */
      fos = new FileOutputStream("save1.data");
      ObjectOutputStream oos; /* ใช้ในการจัดการการเขียนObject */
      oos = new ObjectOutputStream(fos); /* เขียนลงในไฟล์fos */
      oos.writeObject(v); /* เขียนvector ลงไป */
      oos.flush();
      fos.close();
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}
