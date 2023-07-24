import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLayout extends JFrame implements ActionListener {
        JLabel passField;

    public AppLayout(){
        JLabel label = new JLabel("Password Generator");
        label.setBounds(60, 50, 150, 20);

        JLabel label2 = new JLabel("Click here to generate new password =>");
        label2.setBounds(60, 70, 300, 20);

        JButton b = new JButton("New");
        b.setBounds(60, 100, 85, 30);

        
        passField = new JLabel("**********");
        passField.setBounds(60, 130, 300, 30);
        add(passField);
        
        add(label);
        add(label2);
        add(b);
       

        b.addActionListener(this);

        setSize(450, 650);
        setLayout(null);
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent a) {
        // TODO Auto-generated method stub
        try {

            int passlength = 10;
            String set = "ABCDEEFGHIJKLNMOPQRSTUVWXYZ1233456789!@#$";
            char[] passaword = new char[passlength];
            for(int i=0;i<passlength;i++){
                int index = (int)(Math.random()*set.length());
                passaword[i] = set.charAt(index);
            }

            passField.setText(new String(passaword));

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
