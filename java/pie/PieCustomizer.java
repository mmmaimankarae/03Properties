package pie;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;

public class PieCustomizer extends Panel 
implements ActionListener, Customizer {
  private final static int NUMITEMS = 5;
  private TextField names[], values[];
  private ColorChoice colors[];
  private Button apply;
  private PropertyChangeSupport pcsupport;
  private Pie pie;

  public PieCustomizer() {

    // Initialize labels
    Label labels[] = new Label[3];
    labels[0] = new Label("Name");
    labels[1] = new Label("Value");
    labels[2] = new Label("Color");

    // Initialize names
    names = new TextField[NUMITEMS];
    for(int i = 0; i < NUMITEMS; i++) {
      names[i] = new TextField("");
    }

    // Initialize values
    values = new TextField[NUMITEMS];
    for(int i = 0; i < NUMITEMS; i++) {
      values[i] = new TextField("");
    }

    // Initialize colors
    colors = new ColorChoice[NUMITEMS];
    for(int i = 0; i < NUMITEMS; i++) {
      colors[i] = new ColorChoice();
    }

    // Initialize the "Apply" button
    apply = new Button("Apply");
    apply.addActionListener(this);

    // Arrange GUI elements
    setLayout(new BorderLayout());
    Panel pc = new Panel();
    pc.setLayout(new GridLayout(NUMITEMS + 1, 3, 5, 5));
    pc.add(labels[0]);
    pc.add(labels[1]);
    pc.add(labels[2]);
    for(int i = 0; i < NUMITEMS; i++) {
      pc.add(names[i]);
      pc.add(values[i]);
      pc.add(colors[i]);
    }
    add("Center", pc);
    Panel ps = new Panel();
    ps.add(apply);
    add("South", ps);
    setSize(300, 180);

    // Create a PropertyChangeSupport object
    pcsupport = new PropertyChangeSupport(this);
  }

  public Insets getInsets() {
    return new Insets(10, 10, 10, 10);
  }

  public void setObject(Object object) {

    // Save reference to the Pie object
    pie = (Pie)object;

    // Get data from the pie object
    Vector data = pie.getData();
    Enumeration e = data.elements();
    int i = 0;
    while(e.hasMoreElements()) {
      Data d = (Data)e.nextElement();
      names[i].setText(d.getName());
      values[i].setText("" + d.getValue());
      colors[i].setColor(d.getColor());
      i++;
    }
  }

  public void 
  addPropertyChangeListener(PropertyChangeListener pcl) {
    pcsupport.addPropertyChangeListener(pcl);
  }

  public void 
  removePropertyChangeListener(PropertyChangeListener pcl) {
    pcsupport.removePropertyChangeListener(pcl);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == apply) {

      // Process the information from the GUI elements
      Vector data = new Vector();
      for(int i = 0; i < NUMITEMS; i++) {
        String name = names[i].getText();
        double value = translate(values[i]);
        Color color = colors[i].getColor();
        data.addElement(new Data(name, value, color));
      }

      // Update the Bean
      pie.setData(data);
    }
  }

  private double translate(TextField tf) {
    // Convert the string entry in a text field
    // to a double
    String s = tf.getText();
    double d;
    try {
      d = Double.valueOf(s).doubleValue();
    }
    catch(NumberFormatException e) {
      tf.setText("0");
      return 0;
    }
    if(d < 0) {
      tf.setText("0");
      return 0;
    }
    return d;
  }
}