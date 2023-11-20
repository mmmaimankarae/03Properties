import java.io.*;
/* Implement Serializable ยอมแปลงเป็นไบท์ */
class Person  implements Serializable {
//class Person {
/* >> Exception: java.io.NotSerializableException: Person */
	private String name, phone;
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;	
	}
	public String toString() {
		return "[" + name + "," + phone + "]";
	}
}
