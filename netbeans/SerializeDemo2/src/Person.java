import java.io.*;
class Person  implements Serializable {
//class Person {
	private String name, phone;
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
		
	}
	public String toString() {
		return "[" + name + "," + phone + "]";
	}
}