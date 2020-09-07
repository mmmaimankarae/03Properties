//package version;
import java.io.*;
import java.awt.*;

public class Save {
  public static void main(String args[]) {
    try {
      //Box box = new Box(3, 4, 5, Color.BLUE);
     Box box = new Box(3, 4, 5);
      System.out.println(box);
      FileOutputStream fos = new FileOutputStream("box.data");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(box);
      oos.flush();
      fos.close();
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}


