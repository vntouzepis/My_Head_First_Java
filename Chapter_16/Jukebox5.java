import java.io.*;
import java.util.* ;


public class Jukebox5{

ArrayList<Song> songList=new ArrayList<Song>();



public static void main (String[] args){
new Jukebox5().go();
}


class ArtistCompare implements Comparator<Song>{
public int compare(Song one, Song two){
    return one.getArtist().compareTo(two.getArtist());
}
}

public void go() {
getSongs();
System.out.println("songList before sorting:");
System.out.println(songList);


System.out.println("songList after title sorting:");
Collections.sort(songList);
System.out.println(songList);

// Comparator<Song> artistCompare=new ArtistCompare();
ArtistCompare artistCompare=new ArtistCompare();

System.out.println("songList after artist sorting:");
Collections.sort(songList,artistCompare);
System.out.println(songList);
Song mySong=new Song("a","b","c","d");
Collections.sort(songList,mySong);
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