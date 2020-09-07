/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuttonevent1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class JavaButtonEvent1 extends JFrame implements ActionListener, WindowListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaButtonEvent1 frameWithButton = new JavaButtonEvent1();
        
    }
    public JavaButtonEvent1() {
        // create instance of Button
        JButton closeButton = new JButton("Close"); 
	// set FlowLayout as the layout manager
	this.setLayout(new FlowLayout());
	// place Button on Frame instance
        this.add(closeButton);
      // establish size, create title & make it visible 
	this.setSize(300,150);     
	this.setTitle("AWT Frame With A Button");
	this.setVisible(true);
	// register frame as listener for button event
	closeButton.addActionListener(this);
	// register frame as listener for frame event
	this.addWindowListener(this);
    }
    public void shutdown() {
        this.dispose();
        System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        shutdown(); 
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        shutdown();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
