package P1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Infant extends JFrame{
    //create button with text
    JButton button = new JButton("Click Me ");

    public Infant() {
        setTitle("Example");
        setSize(300, 200);
        setLayout(null); //disable automatic layout
        button.setBounds(50, 50, 100, 50);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //alternative way 01 to create an ActionListener

//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,
//                        "button Clicked!");
//            }
//        });

        // Alternative way 02 : using Lambda expression

//        button.addActionListener(e -> JOptionPane.showMessageDialog(null
//        , "Button Clicked!"));


        // alternative way 03 : using separate class and implement it by
        // ActionListener class
        button.addActionListener(new ButtonClickHandler());

    }
}

class ButtonClickHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Button Clicked");
    }

    public static void main(String[] args) {
//        new Infant().setVisible(true);

        // alternative and best/safe option

        SwingUtilities.invokeLater(() -> new Infant().setVisible(true));
    }
}
