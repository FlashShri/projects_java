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

       

        setVisible(true);



    }

    public static void main(String[] args) {
        TextLime txtl = new TextLime();
    }

}
