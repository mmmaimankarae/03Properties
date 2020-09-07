/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexedproperties;

/**
 *
 * @author user
 */
public class IndexedProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IndexedPropertiesClass obj = new IndexedPropertiesClass();
        int [] n = new int [10];
        for(int i = 0; i < n.length; i++) {
            n[i] = i;
        }
        obj.setNumbers(n);
        for(int i = 0; i < n.length; i++) {
            System.out.println(obj.getNumbers(i));
        }
        obj.setNumbers(5, 100);
        int [] m = obj.getNumbers();
        for(int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
    
}
