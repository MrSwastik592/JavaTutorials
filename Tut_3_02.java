import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Tut_3_02.class" width=400 height=200></applet>
*/
public class Tut_3_02 extends Applet implements ActionListener {
    Button N, W, E, S, C;

    public void init() {
        BorderLayout bl = new BorderLayout();
        this.setLayout(bl);
        N = new Button("North");
        W = new Button("West");
        E = new Button("East");
        S = new Button("South");
        C = new Button("Center");

        N.addActionListener(this);
        W.addActionListener(this);
        E.addActionListener(this);
        S.addActionListener(this);
        C.addActionListener(this);

        add(N, "North");
        add(W, "West");
        add(E, "East");
        add(S, "South");
        add(C, "Center");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == N) {
            N.setForeground(Color.RED);
        }
        if (e.getSource() == W) {
            W.setForeground(Color.BLUE);
        }
        if (e.getSource() == E) {
            E.setForeground(Color.GREEN);
        }
        if (e.getSource() == S) {
            S.setForeground(Color.CYAN);
        }
        if (e.getSource() == C) {
            C.setForeground(Color.ORANGE);
        }
    }
}
