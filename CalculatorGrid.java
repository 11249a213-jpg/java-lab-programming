import java.awt.*;
import javax.swing.*;

public class CalculatorGrid {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "(", ")", "%"
        };

        for (String text : buttons) {
            frame.add(new JButton(text));
        }

        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}