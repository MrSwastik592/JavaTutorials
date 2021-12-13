import javax.swing.*;
import java.awt.*;

public class Tut_6_02 {

    private static void GUI() {

        final JFrame f = new JFrame();

        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setLayout(new FlowLayout());

        JTextArea t = new JTextArea(20, 20);
        JScrollPane s1 = new JScrollPane(t);

        s1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        s1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.getContentPane().add(s1);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                GUI();
            }
        });
    }
}