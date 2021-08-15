import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

public class TextField implements ActionListener, KeyListener {

public static void main(String[] argv){

    TextField gui=new TextField();
    gui.go();
}


public void go(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton("shock me");
JTextField field=new JTextField(20);
JTextField field2=new JTextField("your name");
panel.add(field);

// panel.add(field2);
field.addActionListener(this);
field.addKeyListener(this);
field.setText("whatever");
// field2.setText("whatever2");
field.requestFocus();
// field.selectAll();

System.out.println(field.getText());
// System.out.println(field2.getText());

frame.getContentPane().add(BorderLayout.CENTER,panel);
// frame.getContentPane().add(BorderLayout.NORTH,field2);

frame.setSize(250,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent ev){
System.out.println("event happened!");

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

}