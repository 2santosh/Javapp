import javax.swing.JFrame;
import javax.swing.JLabel; // Corrected the spelling

public class SimpleJLabelExample {
    public static void main(String[] args) {
        // Corrected the spelling of JLabel
        JLabel label = new JLabel("A Very Simple Text Label");

        // Create and set up the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
