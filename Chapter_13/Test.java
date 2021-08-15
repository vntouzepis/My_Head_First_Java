import javax.swing.*;
    import java.awt.*;

public class Test {

public static void main(String[] argv){

    Test gui=new Test();
    gui.go();
}


public void go(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
panel.setBackground(Color.darkGray);
// panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
// JButton button=new JButton("shock me");
JButton buttonTwo=new JButton("bliss");
JButton buttonThree=new JButton("huh?");
JPanel panel2=new JPanel();
    panel2.setBackground(new Color(0,0,0));
        // panel.setBackground(new Color(0,0,0));

// panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
// panel2.setLayout(null);
// buttonTwo.setSize(100, 100);

// buttonThree.setSize(200, 200);


// panel.add(button);
panel2.add(buttonTwo);
// buttonTwo.setLayout(null);

panel2.add(buttonThree);


// frame.getContentPane().add(BorderLayout.EAST,panel);
frame.getContentPane().add(panel);

frame.setContentPane(panel2);
frame.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setVisible(true);
}

}