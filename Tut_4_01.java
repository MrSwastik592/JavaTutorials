import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.event.*;

public class Tut_4_01 extends JFrame implements ActionListener {
    Button b1, b2, b3, b4, b5;

    public Tut_4_01() {
        b1 = new Button("Button One");
        b2 = new Button("Button two");
        b3 = new Button("Button Three");
        b4 = new Button("Button Four");
        b5 = new Button("Button Five");
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);
        setTitle("GridBag Layout Example");
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
        this.setSize(300, 300);
        this.setPreferredSize(getSize());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Tut_4_01();
    }
}
