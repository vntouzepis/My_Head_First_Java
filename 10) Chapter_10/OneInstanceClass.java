public class OneInstanceClass {

public static void main(String[] args){
Cat.createCat();
Cat.createCat();
Cat.setSize(4);
Cat.setSize(44);

Dog a=new Dog();
a.setSize(22);
a.printDetails();
Dog b=new Dog();
b.setSize(33);
b.printDetails();

}
}


class Cat{
    private static int size;
    private static int catCount;
    private static Cat myOnlyCat;


public static void createCat(){
    if (catCount==0)
    myOnlyCat=new Cat();
}

    private Cat(){
        catCount++;
        System.out.println(catCount);

    }

public static void setSize(int mySize){
size=mySize;
        System.out.println(size);

}
}


class Dog
{
private static String speciesFamily="Dogs";
private static int dogCount;
private  int size;

   Dog(){
        dogCount++;
        System.out.println(dogCount);
    }

 public void setSize(int mySize){
size=mySize;
}   

    public void printDetails(){
        System.out.println(speciesFamily);
        System.out.println("size "+size);

    }

}



