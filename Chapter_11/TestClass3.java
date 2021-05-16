import java.io.*;

public class TestClass3 {

 public static void main(String[] args)  {

Food x=new Food();
try{
turnOvenOn();
x.bake();
        System.out.println("bake"); 

}

catch (IOException ex){
    ex.printStackTrace();
    System.out.println("bake failed"); 
}
finally {
    turnOvenOff();
        System.out.println("turn Oven Off"); 

}
}

public static void turnOvenOn(){}
public static void turnOvenOff(){}

}

class Food{
public void bake() throws IOException {
        if (3==5){
Food f= new Food();}
else 
    throw new IOException();
}
}

