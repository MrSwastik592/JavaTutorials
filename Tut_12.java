
import javax.swing.*;
import java.awt.event.*;

public class Tut_12 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField tf1, tf3, tf4, tf5;
    JPasswordField tf2;
    JButton b1, b2;
    JPanel p;

    Tut_12() {
        l1 = new JLabel("Username : ");
        l2 = new JLabel("Password : ");
        l3 = new JLabel("");

        tf1 = new JTextField(10);
        tf2 = new JPasswordField(10);

        tf3 = new JTextField(10);
        tf4 = new JTextField(10);
        tf5 = new JTextField(10);

        b1 = new JButton("Login");
        b2 = new JButton("Add");
        b1.addActionListener(this);
        b2.addActionListener(this);

        p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        add(p);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(b1);
        p.add(l3);
        p.add(tf3);
        p.add(tf4);
        p.add(b2);
        p.add(tf5);
        this.setVisible(true);
        this.setSize(400, 500);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String pass = tf2.getText();
            if (pass.length() <= 6) {
                l3.setText("Password length must be >6 characters");
            } else {
                l3.setText("Successfully Logged In ");
            }
        }
        if (ae.getSource() == b2) {
            int num1 = Integer.valueOf(tf3.getText());
            int num2 = Integer.valueOf(tf4.getText());

            int addition = num1 + num2;

            tf5.setText(String.valueOf(addition));
        }
    }

    public static void main(String[] args) {
        new Tut_12();
    }
}
