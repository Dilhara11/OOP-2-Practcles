import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculator {

    private JPanel contentPane;
    private JTextField display;
    private JButton zeroButton;
    private JButton plusButton;
    private JButton threeButton;
    private JButton sixButton;
    private JButton fiveButton;
    private JButton multiplyButton;
    private JButton twoButton;
    private JButton substrateButton;
    private JButton decimalButton;
    private JButton nineButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton divideButton;
    private JButton oneButton;
    private JButton equalButton;
    private JButton fourButton;

    private double num1, num2;
    private String operator;

    public Calculator() {
        ActionListener numberListener = e -> display.setText(display.getText() + ((JButton) e.getSource()).getText());

        oneButton.addActionListener(numberListener);
        twoButton.addActionListener(numberListener);
        threeButton.addActionListener(numberListener);
        fourButton.addActionListener(numberListener);
        fiveButton.addActionListener(numberListener);
        sixButton.addActionListener(numberListener);
        sevenButton.addActionListener(numberListener);
        eightButton.addActionListener(numberListener);
        nineButton.addActionListener(numberListener);
        zeroButton.addActionListener(numberListener);

        plusButton.addActionListener(e -> setOperator("+"));
        substrateButton.addActionListener(e -> setOperator("-"));
        divideButton.addActionListener(e -> setOperator("/"));
        multiplyButton.addActionListener(e -> setOperator("*"));

        equalButton.addActionListener(e -> {
            num2 = Double.parseDouble(display.getText());
            switch (operator){
                case "+" -> display.setText(String.valueOf(num1 + num2));
                case "-" -> display.setText(String.valueOf(num1 - num2));
                case "/" -> display.setText(String.valueOf(num1 / num2));
                case "*" -> display.setText(num2 != 0 ? String.valueOf(num1 * num2) : "Error");
            }
        });
    }


    private void setOperator(String op){
        num1 = Double.parseDouble(display.getText());
        operator = op;
        display.setText("");
    }

    public static void main(String[] args) {
        JFrame jframe = new JFrame("Calculator");
        Calculator calculator = new Calculator();

        jframe.setContentPane(calculator.contentPane);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setSize(300, 200);
        jframe.setVisible(true);
    }
}
