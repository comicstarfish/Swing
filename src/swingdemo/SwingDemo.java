package swingdemo;


import java.awt.*;
import javax.swing.*;

public class SwingDemo {

    public static void main(String[] args) {
        buttonDemo();
    }

    public static void buttonDemo() throws HeadlessException {
        JFrame f = new JFrame("Demo");
        JLabel l1, l2, L3;
        l1 = new JLabel("Name");
        l2 = new JLabel("USN");
        L3 = new JLabel("Password");
        JButton button= new JButton("Ok Sir!");
        f.add(l1);
        f.add(l2);
        f.add(L3);
        f.setSize(600, 500);
        f.add(button);
        button.setBounds(50, 50, 90, 50);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
