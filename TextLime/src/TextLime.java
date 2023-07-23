// import javax.swing.BorderFactory;
// import javax.swing.JFileChooser;
// import javax.swing.JFrame;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.KeyStroke;
// import javax.swing.WindowConstants;
// import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
public class TextLime  extends JFrame implements ActionListener{
    
    JTextArea area;
    String  text ="";
    public TextLime(){
        setSize(750, 850);
        setTitle("TextLime Editor");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // creatint MENU BAR
        JMenuBar menu_bar = new JMenuBar(); 

        //add menu bar to Frame
        setJMenuBar(menu_bar);

        //creating menu
        //for that we need instance of JMenu class

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        //adding menu in menu bar
        menu_bar.add(file);
        menu_bar.add(edit);
        menu_bar.add(help);

        //now creating menu items in File menu
        JMenuItem newButton = new JMenuItem("New");
        JMenuItem openButton = new JMenuItem("Open");
        JMenuItem saveButtton = new JMenuItem("Save");
        JMenuItem printButton = new JMenuItem("Print");
        JMenuItem exitButton = new JMenuItem("Exit"); 

        // creating menu items in Edit menu
        JMenuItem copyButton = new JMenuItem("Copy");
        JMenuItem pasteButton = new JMenuItem("Paste");
        JMenuItem cutButton = new JMenuItem("Cut");
        JMenuItem selectAllButton = new JMenuItem("Select All");

        //creating menu items in Help menu
        JMenuItem aboutButton = new JMenuItem("About");

        //Adding menu items to Menu

        file.add(newButton);
        file.add(openButton);
        file.add(saveButtton);
        file.add(printButton);
        file.add(exitButton);

        edit.add(copyButton);
        edit.add(pasteButton);
        edit.add(cutButton);
        edit.add(selectAllButton);

        help.add(aboutButton);

        //adding KeyBoard short cuts

        newButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        openButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        saveButtton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        printButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        exitButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        copyButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        pasteButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        cutButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        selectAllButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        aboutButton.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
        
        //adding text area 
        area = new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(new Font("SAN_SERIF",Font.PLAIN,20));

        JScrollPane pane = new JScrollPane(area);
        pane.setBorder(BorderFactory.createEmptyBorder());
        add(pane);

        //adding acction listners

        newButton.addActionListener(this);
        openButton.addActionListener(this);
        saveButtton.addActionListener(this);
        printButton.addActionListener(this);
        exitButton.addActionListener(this);

        copyButton.addActionListener(this);
        pasteButton.addActionListener(this);
        cutButton.addActionListener(this);
        selectAllButton.addActionListener(this);
        aboutButton.addActionListener(this);

        setVisible(true);



    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("New")){
            area.setText("");
        }else if(e.getActionCommand().equals("Open")){
            JFileChooser chooser = new JFileChooser();
            chooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
            chooser.addChoosableFileFilter(restrict);

            int action = chooser.showOpenDialog(this);

            if(action == JFileChooser.APPROVE_OPTION){
                File file = chooser.getSelectedFile() ;

                try {
                    
                    BufferedReader br = new BufferedReader(new FileReader(file));

                    area.read(br,null);
                    br.close();
                    area.requestFocus();

                } catch (Exception e1) {
                    // TODO: handle exception
                    e1.printStackTrace();
                }
                
            }

        }else if(e.getActionCommand().equals("Save")){

            JFileChooser saveAs = new JFileChooser();
            saveAs.setApproveButtonText("Save");

            int action = saveAs.showOpenDialog(this);

            if(action != JFileChooser.APPROVE_OPTION){return;}

            File filename = new File(saveAs.getSelectedFile()+".txt");
            BufferedWriter outFile = null ;
            try {
                outFile = new BufferedWriter(new FileWriter(filename ));
                area.write(outFile);
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }

        }else if(e.getActionCommand().equals("Print")){
            try {
                area.print();
            } catch (Exception e3) {
                // TODO: handle exception
            }
        }else if(e.getActionCommand().equals("Exit")){
            System.exit(0);
        }else if(e.getActionCommand().equals("Copy")){
            text = area.getSelectedText();
        }else if(e.getActionCommand().equals("Paste")){
            area.insert(text, area.getCaretPosition());
        }else if(e.getActionCommand().equals("Cut")){
            text = area.getSelectedText();
            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }else if (e.getActionCommand().equals("Select All")) {
        area.selectAll();
        }else if (e.getActionCommand().equals("About")) {
        new About().setVisible(true);
        }


        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

     public static void main(String[] args) {
        TextLime txtl = new TextLime();
    }

}
