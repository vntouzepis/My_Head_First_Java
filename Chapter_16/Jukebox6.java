import java.io.*;
import java.util.* ;


public class Jukebox6{

ArrayList<Song> songList=new ArrayList<Song>();



public static void main (String[] args){
new Jukebox6().go();
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
for (int i=0;i<songList.size();i++){
    System.out.println(songList.get(i).hashCode());

}
Song k=songList.get(7);
System.out.println(songList.get(7).equals(songList.get(8)));
System.out.println(songList.get(7).equals(k));

System.out.println("songList after title sorting:");
Collections.sort(songList);
System.out.println(songList);
HashSet<Song> songSet=new HashSet<Song>();
songSet.addAll(songList);
System.out.println("songList after HashSet:");
System.out.println(songSet);


        Iterator value = songSet.iterator();
 System.out.println("The iterator values are: ");
        while (value.hasNext()) {
                        System.out.println(value.next().hashCode());

        }

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