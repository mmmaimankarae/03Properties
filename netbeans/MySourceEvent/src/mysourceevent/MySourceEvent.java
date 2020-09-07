/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysourceevent;

/**
 *
 * @author sarun
 */
public class MySourceEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MySource s1 = new MySource();
        MyReceiver r1 = new MyReceiver();
        MyReceiver r2 = new MyReceiver();
        s1.addMyListener(r1);
        s1.addMyListener(r2);
        s1.setSource(5);
        s1.setSource(6);
    }
    
}
