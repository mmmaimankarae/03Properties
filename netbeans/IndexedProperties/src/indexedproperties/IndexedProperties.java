package indexedproperties;

public class IndexedProperties {
    public static void main(String[] args) {
        IndexedPropertiesClass obj = new IndexedPropertiesClass();
        int [] n = new int [10];
        for(int i = 0; i < n.length; i++) { /* Define data in index */
            n[i] = i;
        }
        obj.setNumbers(n); /* Set ทั้ง Array */
        for(int i = 0; i < n.length; i++) {
            /* Get ข้อมูลในArray */
            System.out.println(obj.getNumbers(i));
        }
        obj.setNumbers(5, 100); /* Set ข้อมูลในArray */
        int [] m = obj.getNumbers(); /* Get ทั้งArray */
        for(int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}
