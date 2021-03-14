
public class TestHippo
{ 

public static void main(String[] argv){
Hippo k=new Hippo("buffy");
System.out.println(k.getName());

}
}


class Hippo extends Animal{


  Hippo(String name){
super(name);
}
 }




abstract class Animal  {
 private String name;
 
public String getName()
{return name;}

 Animal(String theName){
name=theName;
 }

}