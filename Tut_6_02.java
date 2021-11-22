import javax.swing.*;

public class Tut_6_02 extends JFrame {

    Tut_6_02() {
        JTextArea ta = new JTextArea();
        // JScrollPane sp = new JScrollPane(ta);

        add(ta);
        // add(sp);

        this.setLayout(null);
        this.setSize(400, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Tut_6_02();
    }
}
