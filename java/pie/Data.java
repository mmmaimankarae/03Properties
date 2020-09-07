package pie;
import java.awt.*;
import java.io.*;

public class Data implements Serializable {
  private String name;
  private double value;
  private Color color;

  public Data(String name, double value, Color color) {
    this.name = name;
    this.value = value;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public double getValue() {
    return value;
  }

  public Color getColor() {
    return color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}