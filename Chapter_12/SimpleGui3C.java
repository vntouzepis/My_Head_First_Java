import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class SimpleGui3C implements ActionListener{

JFrame  frame;
JButton button;
JButton button2;
JLabel label;

    public static void main (String[] argv)
    {
SimpleGui3C gui=new SimpleGui3C();
gui.go();

    }



public void go(){
 frame=new JFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         button=new JButton("Change colors");
                 button2=new JButton("Change Label");
 label=new JLabel("I'm a label");
button.addActionListener(this);
button2.addActionListener(this);

MyDrawPanel panel=new MyDrawPanel();


frame.getContentPane().add(BorderLayout.SOUTH,button);
frame.getContentPane().add(BorderLayout.EAST,button2);
frame.getContentPane().add(BorderLayout.WEST,label);

frame.getContentPane().add(BorderLayout.CENTER,panel);

frame.setSize(300,300);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent event){
    if (event.getSource()==button)
    {frame.repaint();

}
else
{
label.setText("That hurt!");
}
}


}



class MyDrawPanel extends JPanel {
public void paintComponent(Graphics g){
Graphics2D g2d=(Graphics2D)g;
int red=(int) (Math.random()*256);
int green=(int) (Math.random()*256);
int blue=(int) (Math.random()*256);
Color startColor=new Color (red,green,blue);
red=(int) (Math.random()*256);
green=(int) (Math.random()*256);
blue=(int) (Math.random()*256);
Color endColor=new Color (red,green,blue);
GradientPaint gradient=new GradientPaint(70,70,startColor,150,150,endColor);
g2d.setPaint(gradient);
g2d.fillOval(70,70,100,100);
}

}


