
public class TestMini
{ 

public static void main(String[] argv){
Mini k=new Mini();
Mini f=new Mini(23);
Object i=new Object();
System.out.println(k.color);
System.out.println(k.kilos);
System.out.println(f.color);
System.out.println(f.kilos);

}
}


class Mini extends Car{

String color;
int kilos;

  Mini(){
this("red",2);}

  Mini(String c,int k){
    super("Mini");
color=c;
kilos=k;}

  Mini(int f){
this("yellow",f);}

}

 class Car  {

Car(String f){}

}