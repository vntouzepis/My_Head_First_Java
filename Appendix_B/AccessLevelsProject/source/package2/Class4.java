package package2;

    
 import package1.Class1;

    
public class Class4 extends Class1 {

       // Class6 testClass;

       public static void main(String[] args) {  

new Class4().meth1();
new Class4().meth4();
Class4 myClass=new Class4();
myClass.meth4();
System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,");
Class4 myClass2=new Class4("test protected");
Class1 class1=new Class4("test protected2");
// Class1 class11=new Class1("test protected2");

       }  


   public void meth1(){

    Class1 myClass=new Class1();
    myClass.meth1();
//     myClass.meth4();
//     Class1 myClass2=new Class4();
// myClass2.meth4();
    }

//   public void meth2(Class6 testClass){

  
//     }


public Class4(){}

public Class4(String var3){
       super(var3);
                            System.out.println(var3);

}

    }


