import java.io.*;
import java.util.* ;


public class Jukebox3{

ArrayList<Song> songList=new ArrayList<Song>();



public static void main (String[] args){
new Jukebox3().go();
}

public void go() {
getSongs();
System.out.println("songList before sorting:");
System.out.println(songList);

// System.out.println("songList after default sorting:");
// Collections.sort(songList);
// System.out.println(songList);

// Song.flag="ar";
// System.out.println("songList after artist sorting:");
// Collections.sort(songList);
// System.out.println(songList);

// Song.flag="t";
System.out.println("songList after title sorting:");
Collections.sort(songList);
System.out.println(songList);
}


void getSongs(){
try{
    File file=new File("SongListMore.txt");
    BufferedReader reader=new BufferedReader(new FileReader(file));
String line=null;
while ((line=reader.readLine())!=null){
    addSong(line);
}
}
catch (Exception ex) {
ex.printStackTrace();
}
}

void addSong(String lineToParse){
 String[] tokens=lineToParse.split("/");
 Song nextSong=new Song(tokens[0],tokens[1],tokens[2],tokens[3]);

 songList.add(nextSong);

}


}