package indexedproperties;

public class IndexedPropertiesClass {
    /* Array attribute */
    private int[] numbers;
    /* Get ทั้งArray */
    public int[] getNumbers() {
        return numbers;
    }
    /* Set ทั้งArray */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    /* Get ข้อมูลในArray */
    public int getNumbers(int index) {
        return this.numbers[index];
    }
    /* Set ข้อมูลในArray */
    public void setNumbers(int index, int numbers) {
        this.numbers[index] = numbers;
    }
}
