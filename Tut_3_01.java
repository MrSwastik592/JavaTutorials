import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Tut_3_01.class" width=400 height=200></applet>
*/
public class Tut_3_01 extends Applet implements ActionListener {

    Button b1, b2, b3, b4, b5;

    public void init() {
        GridLayout gl = new GridLayout(3, 2, 10, 10);

        this.setLayout(gl);

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            setBackground(Color.RED);
        }
        if (e.getSource() == b2) {
            setBackground(Color.BLUE);
        }
        if (e.getSource() == b3) {
            setBackground(Color.GREEN);
        }
        if (e.getSource() == b4) {
            setBackground(Color.BLACK);
        }
        if (e.getSource() == b5) {
            setBackground(Color.ORANGE);
        }
    }

}
