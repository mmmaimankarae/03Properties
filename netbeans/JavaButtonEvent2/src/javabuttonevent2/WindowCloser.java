/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuttonevent2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class WindowCloser extends WindowAdapter {
    JavaButtonEvent2 frameToClose;
    public WindowCloser(JavaButtonEvent2 frame) {
        frameToClose = frame;
    }
    @Override
    public void windowClosing(WindowEvent event) { 
        frameToClose.shutdown();
    }

}
