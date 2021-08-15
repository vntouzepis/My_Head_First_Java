import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.event.*;

public class MyJList implements ActionListener, KeyListener, ListSelectionListener {
JList list;
public static void main(String[] argv){

    MyJList gui=new MyJList();
    gui.go();
}


public void go(){
JFrame frame=new JFrame();
JPanel panel=new JPanel();
JButton button=new JButton("Just Click It");
String [] listEntries={"alpha","beta","gamma","delta","epsilon","zeta","eta","theta"};
list=new JList(listEntries);

JScrollPane scroller=new JScrollPane(list);
scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
panel.add(scroller);
list.addListSelectionListener(this);
list.setVisibleRowCount(4);
list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


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

public void valueChanged(ListSelectionEvent lse){
            System.out.println(!lse.getValueIsAdjusting());

    if (!lse.getValueIsAdjusting()){
                System.out.println(list.getSelectedValue().getClass());
        String selection=(String) list.getSelectedValue();
        System.out.println(selection);
    }
}

}