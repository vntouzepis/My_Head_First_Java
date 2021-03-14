public class Duck {
    private int size;
    private static int duckCount=0; 

public static void main(String[] args){
    Duck a=new Duck();
    Duck b=new Duck();


    System.out.println("Size of duck is "+a.getSize());
    Cat c=new Cat();
    c.meth();
    System.out.println(duckCount);
}

public Duck(){duckCount++;}

public void setSize(int s){
   size=s;
}


public int getSize(){
   return size;
}

}


class Cat{
    private int size;

public  void meth(){

    System.out.println("Size of cat is "+getSize());

}

public void setSize(int s){
   size=s;
}


public int getSize(){
   return size;
}

}



