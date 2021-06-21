import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

 public class MySimpleAnimation {

    public static void main (String[] argv)
    {

System.out.println("jkjhk");
JFrame myFrame=new JFrame();
MyDrawPanel myPanel=new MyDrawPanel();
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setSize(300,300);
myFrame.setVisible(true);
myFrame.getContentPane().add(myPanel);
System.out.println("fgfffg");
// myPanel.repaint();
}
 }


 class MyDrawPanel extends JPanel{
public void paintComponent(Graphics g){

  // int x;
  // int y;
  for (int i=0;i < 130;i++){
//     try{
//   TimeUnit.SECONDS.sleep(10);
// }
// catch (Exception ex){}

      g.setColor(Color.white);
      g.fillRect(0,0,this.getWidth(),this.getHeight());
// g.fillRect(0,0,x,x);
// try{
//   TimeUnit.SECONDS.sleep(10);
// }
// catch (Exception ex){}
g.setColor(Color.orange);
g.fillOval(i,i,40,40);
// try{
//     Thread.sleep(10000);

// TimeUnit.SECONDS.sleep(10);
// }
// catch (Exception ex){}
// delay();
// g.fillOval(20,20,40,40);

// try{
//   Thread.sleep(50);
// }
// catch (Exception ex){}
//       g.setColor(Color.white);
// g.fillRect(0,0,this.getWidth(),this.getHeight());
// }
}
}
 }
 








