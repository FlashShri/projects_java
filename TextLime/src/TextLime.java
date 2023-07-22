import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TextLime  extends JFrame{
    
    public TextLime(){
        setSize(750, 850);
        setTitle("TextLime Editor");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 

        
        setVisible(true);



    }

    public static void main(String[] args) {
        TextLime txtl = new TextLime();
    }

}
