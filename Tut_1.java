import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Tut_1.class" width=400 height=400></applet>
*/
public class Tut_1 extends Applet implements ActionListener {

    public void init() {
        Label l1 = new Label("welcome to java.....!!");
        Checkbox ch1 = new Checkbox("English ");
        Checkbox ch2 = new Checkbox("Marathi");
        Checkbox ch3 = new Checkbox("Hindi");
        Checkbox ch4 = new Checkbox("Sanskrit");

        Button b1 = new Button("OK");
        Button b2 = new Button("CANCEL");
        Button b3 = new Button("RESET");

        b1.addActionListener(this);
        add(l1);

        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);

        add(b1);
        add(b2);
        add(b3);
    }

    public void actionPerformed(ActionEvent e) {

        setBackground(Color.RED);
    }

}