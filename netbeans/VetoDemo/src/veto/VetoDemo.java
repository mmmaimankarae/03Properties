/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package veto;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarun
 */
public class VetoDemo {

    /**
     * @param args the command line arguments
     */
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
