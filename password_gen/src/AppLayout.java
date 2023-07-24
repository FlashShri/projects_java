import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppLayout extends JFrame {
    

    public AppLayout(){
        JLabel label = new JLabel("Password Generator");
        label.setBounds(60, 50, 150, 20);

        JLabel label2 = new JLabel("Click here to generate new password =>");
        label2.setBounds(60, 70, 300, 20);

        JButton b = new JButton("New");
        b.setBounds(60, 100, 85, 30);

        JLabel passField = new JLabel("Absjd@3453");
        passField.setBounds(60, 130, 300, 30);
        
        
        add(label);
        add(label2);
        add(b);
        add(passField);

        setSize(450, 650);
        setLayout(null);
        setVisible(true);




    }
}
