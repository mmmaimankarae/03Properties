package mysourceevent;
import java.util.ArrayList;
/* 3. Class Source */
public class MySource {
	private int source; /* ค่าที่ต้องการเปลี่ยน */
	/* Attribte เก็บคนลงทะเบียน */
	private ArrayList<MyListener> listeners;
	public MySource() {
		listeners = new ArrayList<>();
	}
	/* 4. Code of Source ในการสร้าง, ส่งEvent ไปยังListener */
	public void setSource(int val) {
		source = val;
		fireMyEvent(new MyEvent(this, source));
	}
	public int getSource() {
		return source;
	}
	/* 3.1 method ลงทะเบียน */
	public void addMyListener(MyListener l) {
		listeners.add(l);
	}
	/* 3.2 method ถอนการลงทะเบียน */
	public void removeMyListener(MyListener l) {
		listeners.remove(l);
	}
	public void fireMyEvent(MyEvent e) {
		for(int i = 0; i < listeners.size(); i++) {
			MyListener l = listeners.get(i);
			l.changeMyValue(e);
		}
	}
}
