package mysourceevent;
import java.util.*;
/* 1. Class Event ที่สืบทอด EventObject */
	// เปรียบเป็น Data in Observer
public class MyEvent extends EventObject {
	private int myValue;
	/* รับค่าที่Source ต้องการเปลี่ยนแปลง */
	public MyEvent(Object source, int val) {
		super(source);
		myValue = val;
	}
	public int getMyValue() {
		return myValue;
	}
}
