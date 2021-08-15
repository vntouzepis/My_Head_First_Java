import javax.swing.*;
    import java.awt.*;

public class Exercise  {

public static void main(String[] argv){

    Exercise gui=new Exercise();
    gui.go();
}


public void go(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
panel.setBackground(Color.darkGray);
JButton button=new JButton("tesuji");
JButton button2=new JButton("watari");

frame.getContentPane().add(BorderLayout.SOUTH,panel);
panel.add(button2);

frame.getContentPane().add(BorderLayout.NORTH,button);

frame.setSize(250,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}



}