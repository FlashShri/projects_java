import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppLayout extends JFrame {
    

    public AppLayout(){
        JLabel label = new JLabel("Password Generator");
        label.setBounds(50, 50, 150, 20);
        
        add(label);

        setSize(450, 650);
        setLayout(null);
        setVisible(true);




    }
}
