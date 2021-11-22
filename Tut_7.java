import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tut_7 extends JFrame {
    Tut_7() {
        DefaultMutableTreeNode Root = new DefaultMutableTreeNode("S");
        DefaultMutableTreeNode CPP = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode CM3I = new DefaultMutableTreeNode("CM3I");
        DefaultMutableTreeNode CM4I = new DefaultMutableTreeNode("CM4I");
        DefaultMutableTreeNode CM5I = new DefaultMutableTreeNode("CM5I");
        DefaultMutableTreeNode CM6I = new DefaultMutableTreeNode("CM6I");

        DefaultMutableTreeNode CompetitiveCPP = new DefaultMutableTreeNode("CompetitiveCPP");
        DefaultMutableTreeNode CompetitivePython = new DefaultMutableTreeNode("CompetitivePython");
        DefaultMutableTreeNode Gpp = new DefaultMutableTreeNode("Gpp");
        DefaultMutableTreeNode pratish_portfolio = new DefaultMutableTreeNode("pratish_portfolio");
        DefaultMutableTreeNode pushbar = new DefaultMutableTreeNode("pushbar");
        DefaultMutableTreeNode WebsiteWorkshop = new DefaultMutableTreeNode("WebsiteWorkshop");

        Root.add(CPP);
        Root.add(CM3I);
        Root.add(CM4I);
        Root.add(CM5I);
        Root.add(CM6I);
        Root.add(CompetitiveCPP);
        Root.add(CompetitivePython);
        Root.add(Gpp);
        Root.add(pratish_portfolio);
        Root.add(pushbar);
        Root.add(WebsiteWorkshop);

        DefaultMutableTreeNode addition = new DefaultMutableTreeNode("addition.exe");
        CPP.add(addition);

        JTree jt = new JTree(Root);
        add(jt);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tut_7();
    }
}
