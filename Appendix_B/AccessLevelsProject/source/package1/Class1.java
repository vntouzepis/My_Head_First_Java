package package1;

  
    public class Class1 {

      private String myVar;
      private String var1;
       public static void main(String[] args) {  
Class1 myClass=new Class1();
myClass.meth3();
       }  


  public void meth1(){
       System.out.println("Class1 public meth1");
    }

  private void meth2(){
                     System.out.println("Class1 private meth2");

    }

      void meth3(){
                     System.out.println("Class1 default meth3");
                     meth2();

    }

   protected void meth4(){
              System.out.println("Class1 protected meth4");
                            System.out.println("-----");

              meth1();
    }

void meth5(Class1 myClass){
this.myVar=myClass.myVar;
                            System.out.println(this.myVar);

}

void setMyVar(String var){
  this.myVar=var;
}

public Class1(){
// System.out.println("super");
}

 protected Class1(String var2){
                            System.out.println("var2");

}

    }


