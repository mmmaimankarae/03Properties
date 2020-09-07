package mysourceevent;
import java.util.ArrayList;

public class MySource {
	private int source;
	private ArrayList<MyListener> listeners;
	public MySource() {
		listeners = new ArrayList<>();
	}
	public void setSource(int val) {
		source = val;
		fireMyEvent(new MyEvent(this, source));
	}
	public int getSource() {
		return source;
	}
	public void addMyListener(MyListener l) {
		listeners.add(l);
	}
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
