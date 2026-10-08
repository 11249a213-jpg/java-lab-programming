import java.applet.Applet;
import java.awt.*;

public class GeometricShapes2 extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 100);

        g.setColor(Color.BLUE);
        g.fillOval(250, 50, 150, 100);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 100, 200);
    }
}