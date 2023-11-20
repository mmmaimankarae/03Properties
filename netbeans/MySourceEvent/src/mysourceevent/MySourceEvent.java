package mysourceevent;

public class MySourceEvent {
    public static void main(String[] args) {
        MySource s1 = new MySource();
        MyReceiver r1 = new MyReceiver();
        MyReceiver r2 = new MyReceiver();
        /* 6. ลงทะเบียน */
        s1.addMyListener(r1);
        s1.addMyListener(r2);
        s1.setSource(5);
        s1.setSource(6);
    }
}
