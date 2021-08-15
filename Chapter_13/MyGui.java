import javax.swing.*;
    import java.awt.*;

public class MyGui {

public static void main(String[] argv){
JFrame frame=new JFrame();
JButton button1=new JButton("button11111111111111111111111");
JButton button2=new JButton("hh");
JButton button3=new JButton("button3");
JButton button4=new JButton("button4");

JPanel panel=new JPanel();
// panel.setPreferredSize(new Dimension(1200, 200));
// panel.setSize(new Dimension(1200, 200));
button1.setSize(1200, 1200);

frame.getContentPane().add(BorderLayout.CENTER,panel);
// frame.getContentPane().add(panel);

panel.setBackground(Color.darkGray);
// panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setSize(300,300);
frame.setVisible(true);

}

}