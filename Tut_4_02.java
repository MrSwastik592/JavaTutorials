import javax.swing.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.*;

public class Tut_4_02 extends JFrame implements ActionListener, KeyListener {
    JLabel l1, l2, l3;
    Button b1;
    JTextField tf;
    TextArea ta;

    Tut_4_02() {
        l1 = new JLabel("Name");
        l2 = new JLabel("Comments");
        l3 = new JLabel("");
        b1 = new Button("Submit");
        tf = new JTextField(10);
        ta = new TextArea(5, 10);

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(l1, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(tf, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(l2, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(ta, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(b1, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(l3, gbc);

        tf.addActionListener(this);
        ta.addKeyListener(this);
        b1.addActionListener(this);

        this.setVisible(true);
        this.setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            l3.setText("You entered some text in Textfield");
        }

        if (e.getSource() == b1) {
            l3.setText("You Clicked submit button");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
        if (e.getSource() == ta) {
            l3.setText("You entered some text in Textarea");
        }
    }

    public static void main(String[] args) {
        new Tut_4_02();
    }

}
