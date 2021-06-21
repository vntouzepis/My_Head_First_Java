import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


 public class TwoButtons1 {
  JFrame frame;
  JLabel label;
  JButton bt1;
  JButton bt2;
    public static void main (String[] argv)
    {

TwoButtons1 tb=new TwoButtons1();
tb.go();

}


public void go(){
 frame=new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

bt1=new JButton("click me");
bt2=new JButton("click me 2");
label=new JLabel("i am label");
MyDrawPanel drawPanel=new MyDrawPanel();
JPanel panel = new JPanel(new BorderLayout());

bt1.addActionListener(new Button1());
bt2.addActionListener(new Button2());

panel.add(BorderLayout.SOUTH,bt1);
panel.add(bt2,BorderLayout.EAST);
panel.add(label,BorderLayout.WEST);
panel.add(drawPanel,BorderLayout.CENTER);

frame.add(panel);

  frame.setSize(400,400);  
    frame.setVisible(true);

}


 class Button1 implements ActionListener{
   public void actionPerformed(ActionEvent e){
frame.repaint();
}}



 class Button2 implements ActionListener{
public void actionPerformed(ActionEvent e){
label.setText("I am clicked!");
}}

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



