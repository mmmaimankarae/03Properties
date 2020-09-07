package veto;
import java.beans.*;

public class Auto {
  private int speed;
  private VetoableChangeSupport vcs;
  public Auto() {
    speed = 0;
    vcs = new VetoableChangeSupport(this);
  }
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int value) 
  throws PropertyVetoException {
    Integer oldSpeed = new Integer(speed);
    Integer newSpeed = new Integer(value);
    vcs.fireVetoableChange("speed", oldSpeed, newSpeed);
    speed = value;
  }
  public void addVetoableChangeListener(VetoableChangeListener vcl) {
    vcs.addVetoableChangeListener(vcl);
  }
  public void removeVetoableChangeListener(VetoableChangeListener vcl) {
    vcs.removeVetoableChangeListener(vcl);
  }
}