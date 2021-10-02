import java.io.*;

public class GameSaverTest {


    public static void main(String[] args){
//         GameCharacter one=new GameCharacter(50,"Elf",new String[] {"bow","sword","dust"},new Duck());
//         GameCharacter two=new GameCharacter(200,"Troll",new String[] {"bare hands","big ax"}, new Duck());
//         GameCharacter three=new GameCharacter(120,"Magician",new String[] {"spells","invisibility"}, new Duck());
// try{
// ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Game.ser"));
// os.writeObject(one);
// os.writeObject(two);
// os.writeObject(three);
// os.close();
// }
// catch(Exception ex){
//     ex.printStackTrace();
// }

// one=null;
// two=null;
// three=null;



try{
ObjectInputStream is=new ObjectInputStream(new FileInputStream("Game.ser"));
GameCharacter oneRestore=(GameCharacter) is.readObject();
GameCharacter twoRestore=(GameCharacter) is.readObject();
GameCharacter threeRestore=(GameCharacter) is.readObject();
System.out.println("One's type: "+oneRestore.getType());
System.out.println("Two's type: "+twoRestore.getType());
System.out.println("Three's type: "+threeRestore.getType());
System.out.println("Two's type: "+twoRestore.getWeapons());
System.out.println("Two's power: "+twoRestore.getPower());

}
catch(Exception ex){
    ex.printStackTrace();
}
    }
}


class GameCharacter implements Serializable  {
      private static final long serialVersionUID = 7241346241770217630L;

int power;
 String type;
String[] weapons;
     Duck duck;



public GameCharacter( int p, String t, String[] w, Duck d){
    power=p;
    type=t;
    weapons=w;
    duck=d;
}

public int getPower(){
    return power;
}

public String getType(){
    return type;
}

public String getWeapons(){
    String weaponList="";
    for (int i=0;i<weapons.length;i++){
weaponList=weaponList+weapons[i]+" ";
    }
    return weaponList;
}
}


class Duck implements Serializable{}
