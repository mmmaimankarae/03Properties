package boundpropertiessample;

public class BoundPropertiesSample {
    public static void main(String[] args) {
        MyPropertiesBean mySource = new MyPropertiesBean();
        Listener1 l1 = new Listener1();
        Listener2 l2 = new Listener2();
        mySource.addPropertyChangeListener(l1);
        mySource.addPropertyChangeListener(l2);
        mySource.setSampleProperty("New data");
    }
}
