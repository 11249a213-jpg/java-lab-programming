import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo() {

        setLayout(new BorderLayout());

        add(new Button("HEADER"), BorderLayout.NORTH);
        add(new Button("FOOTER"), BorderLayout.SOUTH);
        add(new Button("MENU"), BorderLayout.WEST);
        add(new Button("EAST"), BorderLayout.EAST);
        add(new Button("CONTENT"), BorderLayout.CENTER);

        setTitle("Border Layout Dashboard");
        setSize(500, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}