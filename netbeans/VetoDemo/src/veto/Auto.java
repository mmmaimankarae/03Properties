package veto;
import java.beans.*;
/* Class Source */
public class Auto {
  private int speed; /* 1.1 constrained Property */
  /* 1.2 VetoableChangeSupport สร้างObject ให้ช่วยจัดการ */
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
  /* method ลงทะเบียน */
  public void addVetoableChangeListener(VetoableChangeListener vcl) {
    vcs.addVetoableChangeListener(vcl);
  }
  /* method ถอนการลงทะเบียน */
  public void removeVetoableChangeListener(VetoableChangeListener vcl) {
    vcs.removeVetoableChangeListener(vcl);
  }
}
