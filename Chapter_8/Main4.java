import java.util.*;

class Main4{

    public static void main(String[] args){


Parent p=new Parent();
Child c=new Child();
//c=(Child)p;
        Parent p2=new Child();

        Child c1=(Child)p2;




    }
}

 class Parent{

}



class Child extends Parent{}

