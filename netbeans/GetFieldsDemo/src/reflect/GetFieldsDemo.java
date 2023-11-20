package reflect;
import java.lang.reflect.*;

public class GetFieldsDemo {
  public static void main(String args[]) {
    try {
      // Get the class object
        /* ใส่Parameter เข้ามาตอนรัน
         *   = ชื่อ Class ที่ต้องการ */
      Class c = Class.forName(args[0]);

      // Display the fields
      Field fields[] = c.getFields();
      for(int i = 0; i < fields.length; i++) {
        System.out.println(fields[i].getName());
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
     