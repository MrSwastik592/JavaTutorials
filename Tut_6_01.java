
import javax.swing.*;

public class Tut_6_01 extends JFrame {

    Tut_6_01() {
        String States[] = { "Andaman and Nicobar", "Andhra Pradesh", "Delhi", "Goa", "Maharastra" };
        JComboBox cb = new JComboBox<>(States);
        cb.setBounds(50, 50, 200, 30);
        this.add(cb);
        this.setLayout(null);
        this.setSize(400, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Tut_6_01();
    }
}
