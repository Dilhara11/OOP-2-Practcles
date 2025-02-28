package P2;

import javax.swing.*;
import java.awt.*;

public class OneYrOld extends JFrame {
    private JLabel label = new JLabel("Enter Your Name: ");
    private JTextField textField = new JTextField();
    private JButton submitButton = new JButton("Submit");
    private JLabel output = new JLabel();

    public OneYrOld() {
        setTitle("User Name");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
//        label.setBounds(20, 20, 20, 20);
//        textField.setBounds(50, 20, 30, 20);
//        submitButton.setBounds(40, 40, 20, 20);
//        label.setBounds(40, 70, 20, 20);
        add(label);
        add(textField);
        add(submitButton);
        add(output);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(e -> {
            String userName = textField.getText();
            output.setText("Hello, " + userName);
        });
    }

    public static void main(String[] args) {
        new OneYrOld();
    }


}