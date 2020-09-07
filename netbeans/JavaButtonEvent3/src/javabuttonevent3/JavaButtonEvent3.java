/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabuttonevent3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class JavaButtonEvent3 extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JavaButtonEvent3 frameWithButton = new JavaButtonEvent3();
    }
    
    public JavaButtonEvent3() {
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
        // create anonymous inner class to handle window closing event
		// register the inner class as a listener with the frame
	this.addWindowListener
	(  // begin inner class definition
		new WindowAdapter() // superclass of inner class is WindowAdapter
		{ 
                        @Override
                    public void windowClosing(WindowEvent event) {
                        shutdown();
                    } // invoke shutDown in outer class
		}// end of inner class definition	  
	 ); // end of argument sent to addWindowListener method
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
