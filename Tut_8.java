// Write a Java program to create a table of Name of Student, Percentage and Grade
// of 10 students using JTable.

import javax.swing.*;

public class Tut_8 extends JFrame {
    JTable jt;

    Tut_8() {
        String column[] = {
                "Name of Student", "Percentage", "Grade"
        };
        String data[][] = {
                { "Amit", "50", "C" },
                { "Yash", "86", "A" },
                { "Swapnil", "73", "B+" },
                { "Ajay", "56", "C" },
                { "Vijay", "76", "B+" },
                { "Ramesh", "53", "C" },
                { "Suresh", "86", "A" },
                { "Rahul", "87", "A" },
                { "Keshav", "78", "B+" },
                { "Madhav", "76", "B+" },
        };

        jt = new JTable(data, column);
        JScrollPane scrollpane = new JScrollPane(jt);
        add(scrollpane);

        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new Tut_8();
    }
}
