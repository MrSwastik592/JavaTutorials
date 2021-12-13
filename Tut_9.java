import javax.swing.*;
import java.awt.event.*;

public class Tut_9 extends JFrame implements ActionListener {
    JProgressBar pb;
    JPanel jp;
    JButton b;

    int i = 0;

    Tut_9() {
        pb = new JProgressBar(0, 100);
        pb.setBounds(40, 40, 160, 30);
        pb.setValue(0);
        b = new JButton("Get Progress");
        b.addActionListener(this);
        jp = new JPanel();
        add(jp);
        jp.add(pb);
        jp.add(b);

        setVisible(true);
        setSize(400, 400);
    }

    public void iterate() {
        while (i <= 100) {
            pb.setValue(i);
            i = i + 1;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        Tut_9 t9 = new Tut_9();
        t9.iterate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            pb.setStringPainted(true);
        }

    }
}
