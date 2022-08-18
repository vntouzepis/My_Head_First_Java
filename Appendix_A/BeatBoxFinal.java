import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.event.*;


public class BeatBoxFinal {

JFrame theFrame;
JPanel mainPanel;
JList incomingList;
JTextField userMessage;
ArrayList<JCheckBox> checkboxList;
int nextNum;
Vector<String> listVector=new Vector<String>();
String userName;
ObjectOutputStream out;
ObjectInputStream in;
HashMap<String,boolean[]> otherSeqsMap=new HashMap<String,boolean[]>();

Sequencer sequencer;
Sequence sequence;
Sequence mySequence=null;
Track track;

String[] instrumentNames={"Bass Drum", "Closed Hi-Hat","Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap", 
"Low-mid Tom", "High Agogo", "Open Hi Conga"};

int[] instruments={35,46,42,38,49,39,50,60,70,72,64,56,58,47,67,63};

public static void main (String[] args){

// 1st option: Set default argument
// try{
// new BeatBoxFinal().startUp(args[0]); // args[0] is your user ID/screen name
// }

// catch(Exception ex){
// new BeatBoxFinal().startUp("VasilisDefault");
// }

// 2nd option: Print out message
try{
new BeatBoxFinal().startUp(args[0]); // args[0] is your user ID/screen name
}

catch(Exception ex){
    System.out.println("Please run 'java BeatBoxFinal' again, with an argument for your screen name");
}

}

public void startUp(String name) {
    userName=name;
    // open connection to the server
try{
    Socket sock=new Socket("127.0.0.1",4242);
    out=new ObjectOutputStream(sock.getOutputStream());
    in=new ObjectInputStream(sock.getInputStream());
Thread remote=new Thread(new RemoteReader());
remote.start();
} 
catch(Exception ex){
    System.out.println("couldn't connect - you 'll have to play alone.");
}
setUpMidi();
buildGUI();
}

public void buildGUI(){
    theFrame=new JFrame("Cyber BeatBox "+userName);
BorderLayout layout=new BorderLayout();
JPanel background =new JPanel(layout);
background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

checkboxList=new ArrayList<JCheckBox>();

Box buttonBox=new Box(BoxLayout.Y_AXIS);
JButton start=new JButton("Start");
start.addActionListener(new MyStartListener());
buttonBox.add(start);

JButton stop=new JButton("Stop");
stop.addActionListener(new MyStopListener());
buttonBox.add(stop);

JButton upTempo=new JButton("Tempo Up");
upTempo.addActionListener(new MyUpTempoListener());
buttonBox.add(upTempo);

JButton downTempo=new JButton("Tempo Down");
downTempo.addActionListener(new MyDownTempoListener());
buttonBox.add(downTempo);

JButton sendIt=new JButton("sendIt");
sendIt.addActionListener(new MySendListener());
buttonBox.add(sendIt);

JButton generatePattern=new JButton("Generate random pattern");
generatePattern.addActionListener(new MyGeneratedRandomPatternListener());
buttonBox.add(generatePattern);

JButton jazzPattern=new JButton("Load jazz pattern");
jazzPattern.addActionListener(new MyJazzPatternListener());
buttonBox.add(jazzPattern);

JButton rockPattern=new JButton("Load rock pattern");
rockPattern.addActionListener(new MyRockPatternListener());
buttonBox.add(rockPattern);

JButton reggaePattern=new JButton("Load reggae pattern");
reggaePattern.addActionListener(new MyReggaePatternListener());
buttonBox.add(reggaePattern);

userMessage=new JTextField();
buttonBox.add(userMessage);

incomingList=new JList();
incomingList.addListSelectionListener(new MyListSelectionListener());
incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
JScrollPane theList=new JScrollPane(incomingList);
buttonBox.add(theList);
incomingList.setListData(listVector); // no data to start with

Box nameBox=new Box(BoxLayout.Y_AXIS);
for (int i=0; i<16; i++){
    nameBox.add(new Label(instrumentNames[i]));
}

background.add(BorderLayout.EAST, buttonBox);
background.add(BorderLayout.WEST, nameBox);

theFrame.getContentPane().add(background);
GridLayout grid=new GridLayout(16,16);
grid.setVgap(1);
grid.setHgap(2);
mainPanel=new JPanel(grid);
background.add(BorderLayout.CENTER, mainPanel);

for (int i=0;i<256;i++){
    JCheckBox c=new JCheckBox();
    c.setSelected(false);
    checkboxList.add(c);
    mainPanel.add(c);
} // end loop

theFrame.setBounds(50,50,300,300);
theFrame.pack();
theFrame.setVisible(true);
} // close buildGUI

public void setUpMidi(){
    try{
        sequencer=MidiSystem.getSequencer();
        sequencer.open();
        sequence=new Sequence(Sequence.PPQ,4);
        track=sequence.createTrack();
        sequencer.setTempoInBPM(120);
    }

  catch(Exception e) {e.printStackTrace();}  
} // close setUpMidi


public void buildTrackAndStart(){
    ArrayList<Integer> trackList=null; // this will hold the instruments for each
    sequence.deleteTrack(track);
    track=sequence.createTrack();
    for (int i=0; i<16; i++){

trackList=new ArrayList<Integer>();

for  (int j=0; j<16; j++){
JCheckBox jc=(JCheckBox) checkboxList.get(j+(16*i));
if (jc.isSelected()){
    int key= instruments[i];
    trackList.add(new Integer(key));
}

else {
    trackList.add(null); // because this slot should be empty in the track
}
} // closener loop
makeTracks(trackList);
    } // close outer loop
track.add(makeEvent(192,9,1,0,15)); // - so we always go to full 16 beats

System.out.println(track.size());
System.out.println(track.ticks());
System.out.println("ending");


try {
   sequencer.setSequence(sequence);
   sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
   sequencer.start();
   sequencer.setTempoInBPM(120); 
}    
catch(Exception e){e.printStackTrace();}
} // close method


public class MyStartListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
buildTrackAndStart();
    } // close actionPerformed
} // close inner class

public class MyStopListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
sequencer.stop();
    } // close actionPerformed
} // close inner class

public class MyUpTempoListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
        float tempoFactor=sequencer.getTempoFactor();
        sequencer.setTempoFactor((float) (tempoFactor*1.03));
    } // close actionPerformed
} // close inner class


public class MyDownTempoListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
        float tempoFactor=sequencer.getTempoFactor();
        sequencer.setTempoFactor((float) (tempoFactor*.97));
    }
}

public class MySendListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
        // make an arraylist of just the STATE of the checkboxes
 boolean[] checkboxState=new boolean[256];
 for (int i=0; i<256;i++){ 
        JCheckBox check=(JCheckBox) checkboxList.get(i);
        if (check.isSelected()){
            checkboxState[i]=true;
        }
    } // close loop
 String messageToSend=null;
 try{
    out.writeObject(userName+nextNum++ + ": "+userMessage.getText());
    out.writeObject(checkboxState);
 }
 catch(Exception ex){
    System.out.println("Sorry dude. Could not send it to the server.");
 }
 userMessage.setText("");   
} // close actionPerformed
} // close inner class

public class MyListSelectionListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent le){
if (!le.getValueIsAdjusting()){
    String selected=(String) incomingList.getSelectedValue();
    if (selected!=null){
      
      JFrame frame = new JFrame();
 int result = JOptionPane.showConfirmDialog(frame,"Do you want to save the current pattern?", "Important message",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                 // make an arraylist of just the STATE of the checkboxes
 boolean[] checkboxState=new boolean[256];
 for (int i=0; i<256;i++){ 
        JCheckBox check=(JCheckBox) checkboxList.get(i);
        if (check.isSelected()){
            checkboxState[i]=true;
        }
    } // close loop
 String messageToSend=null;
 try{
    out.writeObject(userName+nextNum++ + ": "+userMessage.getText());
    out.writeObject(checkboxState);
 }
 catch(Exception ex){
    System.out.println("Sorry dude. Could not send it to the server.");
 }
 userMessage.setText("");   
            }
            else if (result == JOptionPane.NO_OPTION){
    System.out.println("Continue with the selected pattern");
            }
           
 // now go the map, and change the sequence
        boolean[] selectedState=(boolean[]) otherSeqsMap.get(selected);
        changeSequence(selectedState);
        sequencer.stop();
        buildTrackAndStart();
    }
}
} // close valueChanged
} // close inner class


public class MyGeneratedRandomPatternListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
            ArrayList<Integer> trackList=null; // this will hold the instruments for each
    sequence.deleteTrack(track);
    track=sequence.createTrack();
     boolean[] checkboxState=new boolean[256];
 Random rd;
 for (int i=0;i<256;i++){
    rd = new Random();
     checkboxState[i]=rd.nextBoolean();
                 System.out.print(checkboxState[i]+" ");
 }
                  System.out.println();

    for (int i=0; i<16; i++){

trackList=new ArrayList<Integer>();

for  (int j=0; j<16; j++){
JCheckBox jc=(JCheckBox) checkboxList.get(j+(16*i));


if (checkboxState[j+(16*i)]){
            jc.setSelected(true);
            System.out.print(j+(16*i)+" ");
            int key= instruments[i];
    trackList.add(new Integer(key));
        }
else {
    jc.setSelected(false);
    trackList.add(null); // because this slot should be empty in the track
}
} // closener loop
makeTracks(trackList);
System.out.println(trackList);

    } // close outer loop
track.add(makeEvent(192,9,1,0,15)); // - so we always go to full 16 beats

System.out.println(track.size());
System.out.println(track.ticks());
System.out.println("ending");


try {
   sequencer.setSequence(sequence);
   sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
   sequencer.start();
   sequencer.setTempoInBPM(120); 
}    
catch(Exception e){e.printStackTrace();}
} // close actionPerformed
} // close inner class


public class MyJazzPatternListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
            ArrayList<Integer> trackList=null; // this will hold the instruments for each
    sequence.deleteTrack(track);
    track=sequence.createTrack();
     boolean[] checkboxState=new boolean[256];
     checkboxState[0]=true;
      checkboxState[2]=true;
      checkboxState[17]=true;
    for (int i=0; i<16; i++){

trackList=new ArrayList<Integer>();

for  (int j=0; j<16; j++){
JCheckBox jc=(JCheckBox) checkboxList.get(j+(16*i));


if (checkboxState[j+(16*i)]){
            jc.setSelected(true);
            System.out.print(j+(16*i)+" ");
            int key= instruments[i];
    trackList.add(new Integer(key));
        }
else {
    jc.setSelected(false);
    trackList.add(null); // because this slot should be empty in the track
}
} // closener loop
makeTracks(trackList);
System.out.println(trackList);

    } // close outer loop
track.add(makeEvent(192,9,1,0,15)); // - so we always go to full 16 beats

System.out.println(track.size());
System.out.println(track.ticks());
System.out.println("ending");


try {
   sequencer.setSequence(sequence);
   sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
   sequencer.start();
   sequencer.setTempoInBPM(120); 
}    
catch(Exception e){e.printStackTrace();}
} // close actionPerformed
} // close inner class


public class MyRockPatternListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
            ArrayList<Integer> trackList=null; // this will hold the instruments for each
    sequence.deleteTrack(track);
    track=sequence.createTrack();
     boolean[] checkboxState=new boolean[256];
     checkboxState[50]=true;
      checkboxState[100]=true;
      checkboxState[150]=true;
    checkboxState[200]=true;
      checkboxState[250]=true;
    for (int i=0; i<16; i++){

trackList=new ArrayList<Integer>();

for  (int j=0; j<16; j++){
JCheckBox jc=(JCheckBox) checkboxList.get(j+(16*i));


if (checkboxState[j+(16*i)]){
            jc.setSelected(true);
            System.out.print(j+(16*i)+" ");
            int key= instruments[i];
    trackList.add(new Integer(key));
        }
else {
    jc.setSelected(false);
    trackList.add(null); // because this slot should be empty in the track
}
} // closener loop
makeTracks(trackList);
System.out.println(trackList);

    } // close outer loop
track.add(makeEvent(192,9,1,0,15)); // - so we always go to full 16 beats

System.out.println(track.size());
System.out.println(track.ticks());
System.out.println("ending");


try {
   sequencer.setSequence(sequence);
   sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
   sequencer.start();
   sequencer.setTempoInBPM(120); 
}    
catch(Exception e){e.printStackTrace();}
} // close actionPerformed
} // close inner class


public class MyReggaePatternListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
            ArrayList<Integer> trackList=null; // this will hold the instruments for each
    sequence.deleteTrack(track);
    track=sequence.createTrack();
     boolean[] checkboxState=new boolean[256];
     checkboxState[4]=true;
      checkboxState[30]=true;
      checkboxState[46]=true;
    checkboxState[62]=true;
      checkboxState[78]=true;
    for (int i=0; i<16; i++){

trackList=new ArrayList<Integer>();

for  (int j=0; j<16; j++){
JCheckBox jc=(JCheckBox) checkboxList.get(j+(16*i));


if (checkboxState[j+(16*i)]){
            jc.setSelected(true);
            System.out.print(j+(16*i)+" ");
            int key= instruments[i];
    trackList.add(new Integer(key));
        }
else {
    jc.setSelected(false);
    trackList.add(null); // because this slot should be empty in the track
}
} // closener loop
makeTracks(trackList);
System.out.println(trackList);

    } // close outer loop
track.add(makeEvent(192,9,1,0,15)); // - so we always go to full 16 beats

System.out.println(track.size());
System.out.println(track.ticks());
System.out.println("ending");


try {
   sequencer.setSequence(sequence);
   sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
   sequencer.start();
   sequencer.setTempoInBPM(120); 
}    
catch(Exception e){e.printStackTrace();}
} // close actionPerformed
} // close inner class

public class RemoteReader implements Runnable {
boolean[] checkboxState=null;
String nameToShow=null;
Object obj=null;
public void run(){
    try{
while((obj=in.readObject()) !=null){
    System.out.println("got an object from server");
    System.out.println(obj.getClass());
    String nameToShow=(String) obj;
    checkboxState=(boolean[]) in.readObject();
    otherSeqsMap.put(nameToShow,checkboxState);
    listVector.add(nameToShow);
    incomingList.setListData(listVector);
} // close while
    }
 catch(Exception ex){
ex.printStackTrace();
 }    
} // close run
} // close inner class


public class MyPlayMineListener implements ActionListener {
    public void actionPerformed(ActionEvent a){
        if (mySequence!=null){
sequence=mySequence;  // restore to my original
        }
} // close actionPerformed
} // close inner class

public void changeSequence(boolean[] checkboxState){
    for (int i=0; i<256; i++){
        JCheckBox check=(JCheckBox) checkboxList.get(i);
        if (checkboxState[i]){
            check.setSelected(true);
        }
        else {
        check.setSelected(false);
        }
    } // close loop
} // close changeSequence

public void makeTracks(ArrayList list){
    Iterator it=list.iterator();
    for (int i=0; i<16; i++){
   Integer num=(Integer) it.next();
   if (num != null){
    int numKey=num.intValue();
    track.add(makeEvent(144,9,numKey,100,i));
        track.add(makeEvent(128,9,numKey,100,i+1));
   }     
    } // close loop
} // close makeTracks()


public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
    MidiEvent event=null;
    try{
        ShortMessage a=new ShortMessage();
        a.setMessage(comd,chan,one,two);
        event=new MidiEvent(a,tick);
    }
    catch(Exception e){}
        return event;
    } // close makeEvent
} // close class