import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel mainPanel;
    private JLabel name;
    private JTextField textField1;
    private JButton submitButton;

    public Example() {
        setContentPane(mainPanel);
        setTitle("Example GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n= textField1.getText();
                JOptionPane.showMessageDialog(Example.this, "Hello! "+n);
            }
        });
    }


    public static void main(String[] args) {
        new Example();
    }
}
