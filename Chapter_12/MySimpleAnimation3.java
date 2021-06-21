import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

 public class MySimpleAnimation3 {
int x;
int y;

MyDrawPanel myPanel;

JFrame myFrame;

    public static void main (String[] argv)
    {
MySimpleAnimation3 anim=new MySimpleAnimation3();

anim.run();
 }

void run(){
   myPanel=new MyDrawPanel();

 myFrame=new JFrame();
 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setSize(300,300);
myFrame.setVisible(true);
myFrame.getContentPane().add(myPanel);
for (int i=0;i<130;i++){
myFrame.repaint();
x++;
y++;
  try{
    Thread.sleep(50);
}
catch (Exception ex){}

}
}

 class MyDrawPanel extends JPanel{


public void paintComponent(Graphics g){
      g.setColor(Color.white);
      g.fillRect(0,0,this.getWidth(),this.getHeight());
g.setColor(Color.orange);
g.fillOval(x,y,40,40);

}
 }
 }

