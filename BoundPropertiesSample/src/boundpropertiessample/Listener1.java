package boundpropertiessample;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/* Listner implement PropertyChangeListener */
public class Listener1 implements PropertyChangeListener{
    /* method ที่จะส่งEvent PropertyChangeEvent */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}
