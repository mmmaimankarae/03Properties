package mysourceevent;
import java.util.EventListener;
/* 2. Interface Listen ที่สืบทอด EventListener */
public interface MyListener extends EventListener {
	/* Method ที่จะไว้แจ้งค่าEvent ที่เปลี่ยนไป */
	public void changeMyValue(MyEvent e);
}
