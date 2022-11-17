import java.awt.event.*;
import javax.swing.*;

    
    public class TestAnon {
       public static void main(String[] args) {  
        new TestAnon().go();

       }  

public void go(){
  JFrame frame=new JFrame();
JButton button=new JButton("click");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(button);
frame.setSize(300,300);
frame.setVisible(true);
QuitListener quitListener=new QuitListener();
// button.addActionListener(quitListener); 
// button.addActionListener(new QuitListener()); 
new Car(){public void run(){System.out.println("dfsdf");}}.run();
button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ev){
      // System.out.println("aaaaa");
      System.exit(0);
}});
}

       public class QuitListener implements ActionListener {
public void actionPerformed(ActionEvent ev){
   System.out.println("sfsfd");
      // System.exit(0);

}

       }
    }


