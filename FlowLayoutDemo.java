import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame {

    FlowLayoutDemo() {

        setLayout(new FlowLayout());

        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));

        setTitle("Flow Layout Example");
        setSize(400, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });FlowLayoutDemo.java
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}