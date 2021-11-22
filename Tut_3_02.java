import java.applet.Applet;
import java.awt.*;

/*
<applet code="Tut_3_02.class" width=400 height=200></applet>
*/
public class Tut_3_02 extends Applet {
    Button N, W, E, S, C;

    public void init() {
        BorderLayout bl = new BorderLayout();
        this.setLayout(bl);
        N = new Button("North");
        W = new Button("West");
        E = new Button("East");
        S = new Button("South");
        C = new Button("Center");

        add(N, "North");
        add(W, "West");
        add(E, "East");
        add(S, "South");
        add(C, "Center");
    }
}
