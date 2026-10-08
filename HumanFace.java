import java.applet.Applet;
import java.awt.*;

public class HumanFace extends Applet {

    public void paint(Graphics g) {

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 250, 250);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(160, 120, 30, 40);
        g.fillOval(260, 120, 30, 40);

        // Nose
        g.drawLine(225, 150, 210, 200);
        g.drawLine(210, 200, 230, 200);

        // Mouth
        g.drawArc(175, 190, 100, 60, 180, 180);
    }
}