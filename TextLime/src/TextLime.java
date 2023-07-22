import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class TextLime  extends JFrame{
    
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

        //

        setVisible(true);



    }

    public static void main(String[] args) {
        TextLime txtl = new TextLime();
    }

}
