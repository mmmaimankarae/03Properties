package veto;
import java.beans.*;
/* 2. Listener implement VetoableChangeListener */
public class Police implements VetoableChangeListener {
  private static final int MAXSPEED = 85;
  private static final int MINSPEED = 0;

  public Police() {
  }
  /* 3. Event ที่ส่งออกมา */
  public void vetoableChange(PropertyChangeEvent pce) 
  throws PropertyVetoException {
    if(pce.getPropertyName().equals("speed")) {
      int speed = (Integer)pce.getNewValue();
      if(speed < MINSPEED || speed > MAXSPEED) {
        String msg = "Speed out of range";
        throw new PropertyVetoException(msg, pce);
      }
    }
  }
}
 