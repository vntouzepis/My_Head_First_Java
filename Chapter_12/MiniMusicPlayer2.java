import javax.sound.midi.*;


 public class MiniMusicPlayer2 implements ControllerEventListener{

    public static void main (String[] argv)
    {
      MiniMusicPlayer2 mini=new MiniMusicPlayer2();
       mini.go();
    }

    public void go(){
try {
  Sequencer sequencer=MidiSystem.getSequencer();
  sequencer.open();

int[] eventsIWant={127};
sequencer.addControllerEventListener(this,eventsIWant);
Sequence seq=new Sequence(Sequence.PPQ,4);
Track track=seq.createTrack();

for (int i=5;i<61;i+=4){
track.add(makeEvent(144,1,i,100,i));
track.add(makeEvent(176,1,127,0,i));

track.add(makeEvent(128,1,i,100,i+2));
}
sequencer.setSequence(seq);
sequencer.setTempoInBPM(220);
sequencer.start();
}
catch(Exception ex) {ex.printStackTrace();}

    }


public void controlChange(ShortMessage event){
  System.out.println("la");
}

public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
MidiEvent event=null;
try{
  ShortMessage a=new ShortMessage();
  a.setMessage(comd,chan,one,two);
  event=new MidiEvent(a,tick);
}
catch(Exception E){}
return event;
}

 }

// import javax.sound.midi.*;
// import java.io.*;
// import javax.swing.*;
// import java.awt.*;

//  public class MiniMusicPlayer2 implements ControllerEventListener{
// MyDrawPanel ml;
//  JFrame f=new JFrame("My First Music Video");

//     public static void main (String[] argv)
//     {
//       MiniMusicPlayer2 mini=new MiniMusicPlayer2();
//        mini.go();
//     }

//     public void go(){
// try {
//   Sequencer sequencer=MidiSystem.getSequencer();
//   sequencer.open();

// int[] eventsIWant={127};
// sequencer.addControllerEventListener(this,eventsIWant);
// Sequence seq=new Sequence(Sequence.PPQ,4);
// Track track=seq.createTrack();

// for (int i=5;i<61;i+=4){
// track.add(makeEvent(144,1,i,100,i));
// track.add(makeEvent(176,1,127,0,i));

// track.add(makeEvent(128,1,i,100,i+2));
// }
// sequencer.setSequence(seq);
// sequencer.setTempoInBPM(220);
// sequencer.start();
// }
// catch(Exception ex) {ex.printStackTrace();}

//     }


// public void controlChange(ShortMessage event){
// ml=new MyDrawPanel();
// f.setContentPane(ml);
// f.setBounds(30,30,300,300);
// f.setVisible(true);
//   ml.repaint();

// }

// public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
// MidiEvent event=null;
// try{
//   ShortMessage a=new ShortMessage();
//   a.setMessage(comd,chan,one,two);
//   event=new MidiEvent(a,tick);
// }
// catch(Exception E){}
// return event;
// }



// }


//  class MyDrawPanel extends JPanel {


// public void paintComponent(Graphics g){
//   int r=(int) (Math.random()*250);
//     int gr=(int) (Math.random()*250);
//   int b=(int) (Math.random()*250);

// g.setColor(new Color(r,gr,b));

//   int ht=(int) ((Math.random()*120)+10);
//     int width=(int) ((Math.random()*120)+10);
//   int x=(int) ((Math.random()*40)+10);
//   int y=(int) ((Math.random()*40)+10);
// g.fillRect(x,y,ht,width);
// }

// }