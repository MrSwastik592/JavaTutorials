import javax.swing.*;
import java.awt.event.*;

public class Tut_10 extends JFrame implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton mul;
    JPanel p;

    Tut_10() {
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);

        mul = new JButton("Multiply");
        mul.addActionListener(this);
        p = new JPanel();

        add(p);
        p.add(tf1);
        p.add(tf2);
        p.add(tf3);
        p.add(mul);

        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new Tut_10();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mul) {
            int num1 = Integer.valueOf(tf1.getText());
            int num2 = Integer.valueOf(tf2.getText());

            int product = num1 * num2;

            tf3.setText(String.valueOf(product));
        }
    }
}
