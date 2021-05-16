import javax.sound.midi.*;


public class MiniMiniMusicApp {

 public static void main(String[] args) {
MiniMiniMusicApp mini=new MiniMiniMusicApp();
mini.play();
}

public void play(){
try {
    Sequencer player=MidiSystem.getSequencer();
    player.open();
    Sequence seq=new Sequence(Sequence.PPQ,4);
    
    Track track=seq.createTrack();

    ShortMessage first=new ShortMessage();
first.setMessage(ShortMessage.PROGRAM_CHANGE,1,102,0);
MidiEvent changeInstrument=new MidiEvent(first,1);
track.add(changeInstrument);


    ShortMessage a=new ShortMessage();
a.setMessage(144,1,44,100);
MidiEvent noteOn=new MidiEvent(a,1);
track.add(noteOn);

  ShortMessage b=new ShortMessage();
b.setMessage(128,1,44,100);
MidiEvent noteOff=new MidiEvent(b,16);
track.add(noteOff);

//     ShortMessage c=new ShortMessage();
// c.setMessage(144,1,70,100);
//  noteOn=new MidiEvent(c,17);
// track.add(noteOn);

//   ShortMessage d=new ShortMessage();
// d.setMessage(128,1,70,100);
//  noteOff=new MidiEvent(d,30);
// track.add(noteOff);

//     Track track2=seq.createTrack();
//     ShortMessage e=new ShortMessage();
// e.setMessage(144,1,100,100);
// noteOn=new MidiEvent(e,40);
// track2.add(noteOn);

//   ShortMessage f=new ShortMessage();
// f.setMessage(128,1,100,100);
// noteOff=new MidiEvent(f,60);
// track2.add(noteOff);

player.setSequence(seq);
player.start();

}
catch (Exception ex){
   ex.printStackTrace();}
}


 }


