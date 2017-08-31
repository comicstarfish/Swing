package swingdemo;


import java.awt.*;
import javax.swing.*;

public class SwingDemo {

    public static void main(String[] args) {
        JFrame f = new JFrame("Demo");
        JLabel l1, l2, L3;
        l1 = new JLabel("First Label");
        l2 = new JLabel("second Label");
        L3 = new JLabel("Third Label");
        f.add(l1);
        f.add(l2);
        f.add(L3);
        f.setSize(600, 500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
