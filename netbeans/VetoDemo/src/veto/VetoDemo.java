package veto;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VetoDemo {
    public static void main(String[] args) {
        Auto autoObj = new Auto();
        Police policeObj = new Police();
        autoObj.addVetoableChangeListener(policeObj);
        try {
            autoObj.setSpeed(100);
            System.out.println("OK");
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(autoObj.getSpeed());
    }
    
}
