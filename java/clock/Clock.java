package clock;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class Clock extends Panel implements Runnable {
  private TextField tf;
  /* ประกาศว่าไม่ต้องSave Thread ลงไป */
  private transient Thread thread;
 //private Thread thread;

  public Clock() {
    tf = new TextField("", 6);
    add(tf);
    startThread();
  }

  private void startThread() {
    thread = new Thread(this);
    thread.start();
  }

  public void run() {
    try {
      SimpleDateFormat sdf;
      sdf = new SimpleDateFormat("HH:mm:ss");
      while(true) {
        Thread.sleep(1000);
        tf.setText(sdf.format(new Date()));
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  /* Override Read เพื่อให้เมื่ออ่านนาฬิกาอีกรอบ
   * มันเดินต่อจากเวลาที่Save */
  private void readObject(ObjectInputStream ois) 
  throws IOException, ClassNotFoundException {
    try {
      ois.defaultReadObject(); /* Call Read Default */
      startThread(); /* method ที่สร้างThread ใหม่ขึ้นมา */
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
