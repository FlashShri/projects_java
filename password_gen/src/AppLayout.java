import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLayout extends JFrame implements ActionListener {
       public JTextPane f;
       public JLabel messageLabel ;

    public AppLayout(){

        setBounds(200,0,1000,1080);
        setTitle("Unbreakable Password");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Password Generator");
        label.setBounds(60, 50, 150, 20);

        JLabel label2 = new JLabel("Click here to generate new password =>");
        label2.setBounds(60, 70, 300, 20);

        JButton b = new JButton("New");
        b.setBounds(60, 100, 85, 30);

        f = new JTextPane();
        f.setBounds(100,200,300,100);
        f.setContentType("text"); 
        f.setFont(new Font("Monospaced",Font.PLAIN,50));
        f.setText("******");
        f.setEditable(false); 
        f.setBackground(null); 
        f.setBorder(null); 
        
        add(label);
        add(label2);
        add(b);
        add(f);

        JButton copy = new JButton("copy");
            copy.setBounds(60, 310, 85, 30);
            add(copy);

         messageLabel = new JLabel();
                messageLabel.setBounds(60, 380, 150, 20);
                add(messageLabel);
       

        b.addActionListener(this);
        copy.addActionListener(this);

        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent a) {
        // TODO Auto-generated method stub
        try {

            messageLabel.setText("");
            if(a.getActionCommand().equals("New")){

            int passlength = 10;
            String set = "ABCDEEFGHIJKLNMOPQRSTUVWXYZ1233456789!@#$";
            char[] passaword = new char[passlength];
            for(int i=0;i<passlength;i++){
                int index = (int)(Math.random()*set.length());
                passaword[i] = set.charAt(index);
            }

            f.setText(new String(passaword));
            }
            else if(a.getActionCommand().equals("copy")){
                System.out.println("copy perforrmed");

                // copy to clipboard
                StringSelection ss = new StringSelection(f.getText());
                Clipboard cpb = Toolkit.getDefaultToolkit().getSystemClipboard();
                cpb.setContents(ss, null);

                messageLabel.setText("password copied");
            
            }

            

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
