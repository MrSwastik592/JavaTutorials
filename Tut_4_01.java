import java.awt.Button;
import java.awt.Label;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.event.*;

public class Tut_4_01 extends JFrame implements ActionListener {
    Button b1, b2, b3, b4, b5;
    Label l1;

    public Tut_4_01() {
        b1 = new Button("Button One");
        b2 = new Button("Button two");
        b3 = new Button("Button Three");
        b4 = new Button("Button Four");
        b5 = new Button("Button Five");

        l1 = new Label("");

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(b1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(b2, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(b3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(b4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(b5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(l1, gbc);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        this.setSize(300, 300);
        this.setPreferredSize(getSize());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText("Button one Pressed");
        }
        if (e.getSource() == b2) {
            l1.setText("Button two Pressed");
        }
        if (e.getSource() == b3) {
            l1.setText("Button three Pressed");
        }
        if (e.getSource() == b4) {
            l1.setText("Button four Pressed");
        }
        if (e.getSource() == b5) {
            l1.setText("Button five Pressed");
        }
    }

    public static void main(String[] args) {
        new Tut_4_01();
    }
}
