import java.util.*;

class Main3{

    public static void main(String[] args){
       
Dog1 d1=new Dog1();
ArrayList<Animal1> mylist=new ArrayList<Animal1>();
mylist.add(d1);


Canine1 d2=(Animal1)mylist.get(0);

//d2.makeNoise();

Canine1 k=new Canine1();
        ArrayList<Canine1> mylist2=new ArrayList<Canine1>();
        mylist2.add(k);
//Canine1 d3=(Dog1)mylist2.get(0);
//d3.makeNoise();



Canine1 c1=(Canine1)mylist.get(0);
c1.roam();

Canine1 c2=(Dog1)mylist.get(0);
c2.roam();

//Cat1 g1=(Cat1)mylist.get(0);
ArrayList<Dog1> mylist1=new ArrayList<Dog1>();
mylist1.add(d1);
Canine1 c3=mylist1.get(0);
c3.roam();

    System.out.println(c3==d1);

    }
}

 class Animal1{

void makeNoise(){};
     void eat(){};
     void sleep(){};
     void roam(){};

}

class Canine1 extends Animal1{

public void roam()
{
    System.out.println("canine roams");
}

public void makeNoise()
{
    System.out.println("canine makes noise");
}

}

class Dog1 extends Canine1 {

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

public void roam()
{
    System.out.println("dog roams");
}

}

class Cat1 extends Animal1{}

