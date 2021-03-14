public class CatIntoCat {
   

public static void main(String[] args){
Cat k=new Cat();
Cat l=new Cat();
k.setSize(4);
l.setSize(44);




}



}


class Cat{
    private int size;
    private static int catCount;
    private  Cat a;




    public Cat(){
        catCount++;
        System.out.println(catCount);

    }

public  void setSize(int mySize){
size=mySize;
        System.out.println(size);
        a=new Cat();

}

}



