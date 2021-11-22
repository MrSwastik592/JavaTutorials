import java.applet.Applet;
import java.awt.*;

/*
<applet code="Tut_3_01.class" width=400 height=200></applet>
*/
public class Tut_3_01 extends Applet {

    Button b1, b2, b3, b4, b5;

    public void init() {
        GridLayout gl = new GridLayout(3, 2, 10, 10);
        this.setLayout(gl);

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
