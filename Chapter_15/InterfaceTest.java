import java.util.* ;


public class InterfaceTest{



public static void main (String[] args){
MyInterface intf=new MyClass();
Runnable myRun=new MyClass();
System.out.println("test");
intf.meth();
Parent p=new Child();
Thread t=new Thread(myRun);
p.print();
t.start();
}
}



class MyClass implements MyInterface, Runnable{

        public void meth(){
            System.out.println("test2");

        }

                public void meth2(){
            System.out.println("test3");

        }
        public void run(){
                        System.out.println("2nd thread");
                        meth2();
        }

}


class Parent {
    // Declaring instance variable by name `x`
    String y = "Parent`s Instance Variable";

    public void print() {
        System.out.println(y);
    }
}

class Child extends Parent {

    // Hiding Parent class's variable `x` by defining a variable in child class with same name.
    String x = "Child`s Instance Variable";

    @Override
    public void print() {
        System.out.println(y);

        // If we still want to access variable from super class, we do that by using `super.x`
        // System.out.print(", " + super.x + "\n");
    }
}


interface MyInterface{

    public void meth();



}