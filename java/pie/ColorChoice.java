package pie;
import java.awt.*;
import java.util.*;

public class ColorChoice extends Choice {
  private static Hashtable colorMap;
  static {
    colorMap = new Hashtable();
    colorMap.put("black", Color.black);
    colorMap.put("blue", Color.blue);
    colorMap.put("cyan", Color.cyan);
    colorMap.put("dark gray", Color.darkGray);
    colorMap.put("gray", Color.gray);
    colorMap.put("green", Color.green);
    colorMap.put("light gray", Color.lightGray);
    colorMap.put("magenta", Color.magenta);
    colorMap.put("orange", Color.orange);
    colorMap.put("pink", Color.pink);
    colorMap.put("red", Color.red);
    colorMap.put("white", Color.white);
    colorMap.put("yellow", Color.yellow);
  }
  private static int n = 0;

  public ColorChoice() {

    // Initialize the entries in the choice
    Enumeration e = colorMap.keys();
    while(e.hasMoreElements()) {
      String str = (String)e.nextElement();
      addItem(str);
    }

    // Select a color
    select(n++);
    if(n >= colorMap.size()) {
      n = 0;
    }
  }

  public Color getColor() {
    return (Color)colorMap.get(getSelectedItem());
  }

  public void setColor(Color color) {
    select(findKey(color));
  }

  private String findKey(Color color) {
    Enumeration e = colorMap.keys();
    while(e.hasMoreElements()) {
      Object key = e.nextElement();
      if(color.equals(colorMap.get(key))) {
        return (String)key;
      }
    }
    return null;
  }
}

  