import java.io.*;

public class Test3 {


    public static void main(String[] args){


String toTest="boo:and:foo";
String[] result=toTest.split("o");
    for(String token:result){
System.out.println(token);
    }
}


    }