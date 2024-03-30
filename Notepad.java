
package notepad;
import java.awt.*;
import java.awt.event.*;

class  MyFrame  extends Frame
{
  TextArea ta;
Label l;
TextField tf;

public  MyFrame ()
{
    
    super("Notepad");
    l=new Label(" P");
    ta=new TextArea(20,50);
    tf=new TextField(20);
          
         Font fo = new Font("Segoe Script", Font.BOLD, 18);
         ta.setFont(fo);
        ta.setForeground(Color.BLACK);
        ta.setBackground(Color.pink);
       
          add(ta);
          
         
}
}
public class Notepad {

    public static void main(String[] args) {
      MyFrame f=new MyFrame();
       f.setBackground(Color.red);
        f.setSize(500,500);
        f.setVisible(true);  
        
    }
    
}
