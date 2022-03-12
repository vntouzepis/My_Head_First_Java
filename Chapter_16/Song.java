import java.util.* ;


class Song implements Comparable<Song>, Comparator<Song>{

String title;
String artist;
String rating;
String bpm;
// static String flag="sds";

// public static void main (String[] args){

// Song a=new Song("song1","artist1","rating1","bpm1");
// Song b=new Song("song2","artist2","rating2","bpm2");
// Song c=a;
// System.out.println(a.toString());
// System.out.println(b.toString());
// System.out.println(c.toString());
// System.out.println(c);

// }


public int hashCode(){
    return title.hashCode();
}


public boolean equals(Object aSong){
Song s=(Song) aSong;
return getTitle().equals(s.getTitle());
}

public Song (String t, String a, String r, String b){
title=t;
artist=a;
rating=r;
bpm=b;
}


public String getTitle(){
    return title;
}

public String getArtist(){
    return artist;
}

public String getRating(){
    return rating;
}

public String getBpm(){
    return bpm;
}


public String toString(){
    // return title+": "+artist;
        return title;

}

public int compareTo(Song s){
//     // if (flag.equals("t"))
return title.compareTo(s.getTitle());
// else if (flag.equals("ar"))
// return artist.compareTo(s.getArtist());
// else
// return title.compareTo(s.getTitle());
}

public int compare(Song one, Song two){
    return one.getBpm().compareTo(two.getBpm());
}

}