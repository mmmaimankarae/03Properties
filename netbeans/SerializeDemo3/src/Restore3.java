import java.io.*;

public class Restore3 {
  public static void main(String args[]) {
    try {
      FileInputStream fis = new FileInputStream("save3.data");
      ObjectInputStream ois = new ObjectInputStream(fis);
      System.out.println(ois.readInt());
      System.out.println(ois.readDouble());
      System.out.println(ois.readBoolean());
      System.out.println(ois.readObject());
      System.out.println(ois.readChar());
      fis.close();
    }
    catch(Exception ex) {
      System.out.println("Exception: " + ex);
    }
  }
}