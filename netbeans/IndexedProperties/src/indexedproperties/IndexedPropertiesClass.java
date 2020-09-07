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
public class IndexedPropertiesClass {
    
    private int[] numbers;

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getNumbers(int index) {
        return this.numbers[index];
    }

    public void setNumbers(int index, int numbers) {
        this.numbers[index] = numbers;
    }

}
