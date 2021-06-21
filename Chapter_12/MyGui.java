import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MyGui{

JFrame frame;


    public static void main (String[] argv)
    {
MyGui mg=new MyGui();
mg.go();
    }


public void go(){
 ColorChange cc=new ColorChange();
 TextChange tc=new TextChange();
 frame=new JFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
cc.goCh(frame);
tc.goTh(frame);
frame.setSize(300,300);
frame.setVisible(true);
}}



class ColorChange implements ActionListener{

JFrame  myframe;

public void goCh(JFrame frame){
myframe=frame;
JButton button=new JButton("Change colors");
button.addActionListener(this);
MyDrawPanel panel=new MyDrawPanel();
myframe.getContentPane().add(BorderLayout.SOUTH,button);
myframe.getContentPane().add(BorderLayout.CENTER,panel);
}

public void actionPerformed(ActionEvent event){
    myframe.repaint();
}}



class TextChange implements ActionListener{

JLabel mylabel;

public void goTh(JFrame frame){
JButton button=new JButton("Change Label");
 JLabel label=new JLabel("I'm a label");
 mylabel=label;
button.addActionListener(this);
frame.getContentPane().add(BorderLayout.EAST,button);
frame.getContentPane().add(BorderLayout.WEST,label);
}

public void actionPerformed(ActionEvent event){
mylabel.setText("That hurt!");
}}


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
}}