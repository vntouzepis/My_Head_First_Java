import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

 public class MySimpleAnimation2 {
int i;
MyDrawPanel myPanel;
JFrame myFrame;

    public static void main (String[] argv)
    {
MySimpleAnimation2 anim=new MySimpleAnimation2();

anim.run();
 }

void run(){
   myPanel=new MyDrawPanel();
 myFrame=new JFrame();
 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setSize(300,300);
myFrame.setVisible(true);
myFrame.getContentPane().add(myPanel);

for ( i=0;i<130;i++){
  myPanel.setXY(i);
myPanel.repaint();
}
}
 }

 class MyDrawPanel extends JPanel{
    int x;
  int y;

public void setXY(int i)
{
  x=i;
  y=i;
  try{
    Thread.sleep(50);
}
catch (Exception ex){}
  }

public void paintComponent(Graphics g){
      g.setColor(Color.white);
      g.fillRect(0,0,this.getWidth(),this.getHeight());
g.setColor(Color.orange);
g.fillOval(x,y,40,40);

}
 }
 








