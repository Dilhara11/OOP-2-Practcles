import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forms_03 {
    private JPanel contentPane;
    private JTextField NameTextField;
    private JTextField AgeTextField;
    private JTextField EmailTextField;
    private JTextArea Display;
    private JButton submitButton;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel emailLabel;

    private String[] names = new String[10];
    private int[] ages = new int[10];
    private String[] eMails = new String[10];
    private int index = 0;

    public Forms_03() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(index < 10){
                    names[index] = NameTextField.getText();
                    ages[index] = Integer.parseInt(AgeTextField.getText());
                    eMails[index] = EmailTextField.getText();
                    index++;
                    updateDisplay();
                }else {
                    JOptionPane.showMessageDialog(null, "Array is full");
                }
            }
        });
    }

    private void updateDisplay(){
        Display.setText("");
        for (int i = 0; i < index; i++){
            Display.append("Name: " + names[i] + ", Age: " + ages[i] + ", Email: " + eMails[i] + "\n");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Forms_03");
        frame.setContentPane(new Forms_03().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
