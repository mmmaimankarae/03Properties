//package version;
import java.awt.*;
import java.io.*;

class Box implements Serializable {

  //private static final long serialVersionUID = 4628194088373291609L;
  private int width, height, depth;
  //private Color color;

  //public Box(int width, int height, int depth, Color color) {
  public Box(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
    //this.color = color;
  }

  public String toString() {
    //return "[" + width + "," + height + "," + depth + "," + color + "]";
    return "[" + width + "," + height + "," + depth + "]";
  }
  
}
