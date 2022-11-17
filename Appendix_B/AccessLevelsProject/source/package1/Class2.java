package package1;

    
    public class Class2 {
         private String myVar;
       public static void main(String[] args) {  

Class2 class2=new Class2();
class2.meth1();
class2.meth2();

       }  


    void meth1(){

    Class1 myClass=new Class1();
myClass.setMyVar("Access private field of another object in same class");
    myClass.meth1();
    myClass.meth4();
    myClass.meth5(myClass);
        Class6 myClass6=new Class6();

    }

    private void meth2(){
 Class1 myClass=new Class1();
    myClass.meth3();

    }
    }


