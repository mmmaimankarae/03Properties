package boundpropertiessample;
import java.beans.*; /* 1. Import java.beans package */
import java.io.Serializable;
/* Class Source */

public class MyPropertiesBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    /* 2. Create Object of PropertyChangeSupport = มีmethod ที่ใช้ลงทะเบียน */
    public MyPropertiesBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    /* 4. setter .firePropertyChange(name propoty, old, new) */
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, 
                oldValue, sampleProperty);
    }
    
    /* 3.1 Implement (2.) method ลงทะเบียน */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    /* 3.2 Implement (2.) method ถอนการลงทะเบียน */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
