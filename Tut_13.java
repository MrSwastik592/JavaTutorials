import javax.swing.*;
import java.awt.event.*;

abstract class Person {
    abstract void eat();
}

class Tut_13 implements WindowListener, MouseMotionListener {
    JLabel l1, l2;

    Tut_13() {

        JFrame frame = new JFrame();

        l1 = new JLabel();
        l2 = new JLabel();

        l1.setBounds(50, 100, 300, 50);
        l2.setBounds(50, 200, 200, 50);

        frame.add(l1);
        frame.add(l2);
        frame.addMouseMotionListener(this);
        frame.addWindowListener(this);
        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Maximized");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public void mouseDragged(MouseEvent e) {
        l1.setText("Mouse dragged from X : " + +e.getX() + ", Y : " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        l2.setText("Mouse moved from X : " + +e.getX() + ", Y : " + e.getY());
    }

    public static void main(String args[]) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
        new Tut_13();
    }
}
