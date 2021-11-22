import java.awt.*;
import java.awt.event.*;

public class Tut_5 extends Frame {
    MenuBar mb;
    MenuItem m1, m2, m3, m4;
    Menu mn;
    MenuShortcut ms;

    Tut_5() {
        setTitle("MenuBar Demo");
        setSize(500, 500);
        setLayout(null);
        ms = new MenuShortcut(KeyEvent.VK_X);
        mn = new Menu("File");
        m1 = new MenuItem("New...");
        m2 = new MenuItem("Open...");
        m3 = new MenuItem("Save As...");
        m4 = new MenuItem("Exit", ms);
        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mn.add(m4);

        mb = new MenuBar();
        mb.add(mn);

        // Answer :-
        setMenuBar(mb);
    }

    public static void main(String[] args) {
        Tut_5 md = new Tut_5();
        md.setVisible(true);
    }
}