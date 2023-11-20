package mysourceevent;
/* 5. Implement Interface 2. */
public class MyReceiver implements MyListener {
    @Override
    public void changeMyValue(MyEvent e) {
        System.out.println("value = " + e.getMyValue());
    }
}
