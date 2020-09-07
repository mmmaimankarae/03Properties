package clock;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class Clock extends Panel implements Runnable {
  private TextField tf;
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

  private void readObject(ObjectInputStream ois) 
  throws IOException, ClassNotFoundException {
    try {
      ois.defaultReadObject();
      startThread();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}