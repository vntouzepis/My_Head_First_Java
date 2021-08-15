import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

public class CheckBox implements ActionListener, KeyListener, ItemListener {
JCheckBox check;
public static void main(String[] argv){

    CheckBox gui=new CheckBox();
    gui.go();
}


public void go(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton("Just Click It");
check=new JCheckBox("Goes to 11");
panel.add(check);
check.addItemListener(this);
check.addActionListener(this);

// check.setSelected(true);
check.setSelected(false);
check.setSelected(true);



frame.getContentPane().add(BorderLayout.CENTER,panel);
frame.getContentPane().add(BorderLayout.SOUTH,button);

frame.setSize(350,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent ev){
System.out.println("Action event happened!");
}

public void keyPressed(KeyEvent ev){
System.out.println("key pressed event happened!");

}


public void keyReleased(KeyEvent ev){
System.out.println("key released event happened!");
}

public void keyTyped(KeyEvent ev){
System.out.println("key typed event happened!");
}

public void itemStateChanged(ItemEvent ev){
    String onOrOff="off";
    if (check.isSelected())
    onOrOff="on";
System.out.println("Check box is "+onOrOff);
}

}