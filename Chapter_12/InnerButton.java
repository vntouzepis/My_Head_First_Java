import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class InnerButton {

JFrame frame;
JButton b;

    public static void main (String[] argv)
    {
InnerButton gui=new InnerButton();
gui.go();
    }


public void go(){
frame=new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 b=new JButton("A");
b.addActionListener(new BListener());
frame.getContentPane().add(BorderLayout.SOUTH,b);
// frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
// frame.getContentPane().add(BorderLayout.EAST,labelButton);
// frame.getContentPane().add(BorderLayout.WEST,label);
frame.setSize(200,100);
frame.setVisible(true);
}




class BListener implements ActionListener{

public void actionPerformed(ActionEvent event){
    if (b.getText().equals("A")){
b.setText("B");
    }
else 
{
b.setText("A");
    }
}
}
}
