import java.util.* ;


public class TestGenerics4{


public static void main (String[] args){
new TestGenerics4().go();
}




public void go() {
ArrayList<Animal> animals=new ArrayList<Animal>();
animals.add(new Dog());
animals.add(new Cat());
animals.add(new Dog());

takeAnimals(animals);

ArrayList<Dog> dogs=new ArrayList<Dog>();
dogs.add(new Dog());
dogs.add(new Dog());
dogs.add(new Dog());

takeAnimals(dogs);


       //Dog[] dogs2={new Dog(),new Dog(),new Dog()};


       //takeAnimals(dogs2);

        }


        //public void takeAnimals(ArrayList<? extends Animal> animals)
        public <T extends Animal> void takeAnimals(ArrayList<T> animals)
{
           for(Animal a:animals){
                a.eat();
//a.add(new Dog());
               // a.bark();
            }

            //    for(int i=0;i<animals.length;i++)
            // {
            //     Dog o=(Dog)animals[i];
                
            //     o.bark();
            // }
      }

//public void takeAnimals(Animal[] animals){
//animals[0]=new Cat();
//}


}


abstract class Animal{
void eat(){
    System.out.println("animal eating");
}
}

class Dog extends Animal{
    void bark(){
            System.out.println("Dog barks");

    };
}

class Cat extends Animal{
    void meow(){};
}