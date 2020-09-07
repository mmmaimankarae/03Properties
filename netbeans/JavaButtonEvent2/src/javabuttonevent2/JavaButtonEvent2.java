/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuttonevent2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class JavaButtonEvent2 extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create instance of Frame 
        JavaButtonEvent2 frameWithButton = new JavaButtonEvent2();
        
    }
    public JavaButtonEvent2() {
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
   	// create instance of WindowCloser 
	WindowCloser eventHandler = new WindowCloser(this);
	// register WindowCloser as listener for frame event
	this.addWindowListener(eventHandler);
    }
    public void shutdown() {
        this.dispose();
        System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        shutdown();
    }
    
}
