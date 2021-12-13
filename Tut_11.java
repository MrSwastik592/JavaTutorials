import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*
<applet code="Tut_11.class"
        height="150" width="350">
</applet> */
public class Tut_11 extends Applet implements MouseListener, MouseMotionListener {
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged from " + e.getPoint());
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse moved from " + e.getPoint());
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked" + e.getClickCount() + "times");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.CYAN);
        repaint();
    }

    public void mouseExited(MouseEvent e) {
    }
}
