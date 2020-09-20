class Main{

    public static void main(String[] args){

Dog d=new Dog();
d.makeNoise();
d.roam();
d.runf();
    }
}

 interface Animal{

public abstract void makeNoise();
public abstract void eat();
public abstract void sleep();
public abstract void roam();

}

abstract class Canine implements Animal{

public void roam()
{
    System.out.println("canine roams");
}
}

class Dog extends Canine implements Runnable{

public void makeNoise()
{
    System.out.println("dog makes noise");
}

public void eat()
{
    System.out.println("dog eats");
}

public void sleep()
{
    System.out.println("dog sleeps");
}

public void runf(){
    System.out.println("runnable");


}
}

