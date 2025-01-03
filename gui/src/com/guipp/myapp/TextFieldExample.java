import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    TextFieldExample() {
        JFrame frame = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new JButton("-"); // Use String instead of char
        b2.setBounds(120, 200, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(b1);
        frame.add(b2);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;

        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        }
        tf3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
