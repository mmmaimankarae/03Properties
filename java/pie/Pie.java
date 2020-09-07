package pie;
import java.awt.*;
import java.util.*;

public class Pie extends Canvas {
  private String title;
  private Vector data;

  public Pie() {
    title = "";
    data = new Vector();
    setSize(150, 150);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
    adjustSize();
  }

  public Vector getData() {
    return data;
  }

  public void setData(Vector data) {
    this.data = data;
    adjustSize();
    repaint();
  }

  public void setFont(Font font) {
    super.setFont(font);
    adjustSize();
  }

  public void paint(Graphics g) {

    // Determine dimensions of Bean
    Dimension size = getSize();
    int height = size.height;
    int width = size.width;

    // Draw border around the component
    g.setColor(Color.black);
    g.drawRect(0, 0, width - 1, height - 1);

    // Draw title of chart
    FontMetrics fm = g.getFontMetrics();
    int fmHeight = fm.getHeight();
    int fmWidth = fm.stringWidth(title);
    int x = (width - fmWidth)/2;
    int y = fm.getAscent();
    g.drawString(title, x, y);

    // Compute placement of Bean
    int radius = (int)(width * 0.4);
    int centerx = (int)(width * 0.5);
    x = centerx - radius;
    y += fmHeight;

    // Compute total of all data values
    double total = 0;
    Enumeration e = data.elements();
    while(e.hasMoreElements()) {
      Data d = (Data)e.nextElement();
      total += d.getValue();
    }

    // Draw a circle if total is zero
    if(total == 0) {
      g.drawOval(x, y, 2 * radius, 2 * radius);
    }

    // Draw wedges
    int startAngle = 0;
    e = data.elements();
    while(e.hasMoreElements()) {
      Data d = (Data)e.nextElement();
      double value = d.getValue();
      if(value == 0) {
        continue;
      }
      Color color = d.getColor();
      g.setColor(color);
      int angle = (int)(360 * value/total);
      g.fillArc(x, y, 2 * radius, 2 * radius, 
        startAngle, angle);
      startAngle += angle; 
    }
    if(total > 0 && startAngle < 360) {
      g.fillArc(x, y, 2 * radius, 2 * radius, 
        startAngle, 360 - startAngle);
    }

    // Draw legend
    e = data.elements();
    x = 10;
    y += width;
    while(e.hasMoreElements()) {
      Data d = (Data)e.nextElement();
      String name = d.getName();
      double value = d.getValue();
      Color color = d.getColor();
      g.setColor(color);
      g.fillRect(x, y, 10, 10);
      g.setColor(Color.black);
      g.drawString(name, x + 15, y + 10);
      y += fmHeight;
    }
  }

  public Dimension getPreferredSize() {
    Graphics g = getGraphics();
    FontMetrics fm = g.getFontMetrics();
    int fmHeight = fm.getHeight();
    Dimension d = getSize();
    int n = data.size();
    return new Dimension(d.width, 
      fmHeight + d.width + fmHeight * n + 10);
  }

  private void adjustSize() {
    Dimension d = getPreferredSize();
    setSize(d.width, d.height);
    Component parent = getParent();
    if(parent != null) {
      parent.invalidate();
      parent.doLayout();
    }
  }
}
