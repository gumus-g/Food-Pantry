import javax.swing.*;
import java.awt.*;

public class Main {
    public static void createAndShowGui() {
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(640, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }
}
