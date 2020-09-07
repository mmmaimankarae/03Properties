package mysourceevent;
public class MyReceiver implements MyListener {

    @Override
    public void changeMyValue(MyEvent e) {
        System.out.println("value = " + e.getMyValue());
    }
    
    
}
