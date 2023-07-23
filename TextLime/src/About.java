import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

public class About extends JFrame{


    public About(){

        setBounds(600, 200, 700,600);
        setLayout(null);
        JLabel l = new JLabel("<html>TextLime text editor project.</html>");
        l.setBounds(150,130,500,300);
        add(l);
    }

}
