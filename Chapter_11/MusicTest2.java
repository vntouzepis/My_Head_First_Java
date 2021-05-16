import javax.sound.midi.*;

public class MusicTest2 {

 public static void main(String[] args) {

    try{
Sequencer sequencer=MidiSystem.getSequencer();
System.out.println("We got a sequencer");  
    // }
    // catch (MidiUnavailableException ex){
    //     System.out.println("Bummer");  

    // }
    //  try{
Sequencer sequencer2=MidiSystem.getSequencer();
System.out.println("We got a sequencer");  
    }
    catch (MidiUnavailableException ex){
        System.out.println("Bummer");  

    }   
MusicTest1 mt=new MusicTest1();
mt.play();
 }

public void play() {
    try{
Sequencer sequencer=MidiSystem.getSequencer();
System.out.println("We got a sequencer");  
    }
    catch (MidiUnavailableException ex){
        System.out.println("Bummer");  

    }
}

}

