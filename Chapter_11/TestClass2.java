import java.io.*;

public class TestClass2 {

 public static void main(String[] args)  {

MyClass x=new MyClass();
try{
Foo f=x.doRiskyThing();
int b=f.getNum();
    System.out.println(b); 
}

catch (IOException ex){
    System.out.println("failed"); 
}
System.out.println("We made it!"); 

}


}

class Foo{
public int getNum()  {
return 5;
}
}

class MyClass{
public Foo doRiskyThing() throws IOException{
    if (3==3){
return new Foo();}
else 
    throw new IOException();
}
}
