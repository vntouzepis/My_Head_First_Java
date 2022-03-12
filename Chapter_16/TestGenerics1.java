import java.util.* ;


public class TestGenerics1{


public static void main (String[] args){
new TestGenerics1().go();
}




public void go() {
Animal[] animals={new Dog(),new Cat(), new Dog()};
Dog[] dogs={new Dog(),new Dog(), new Dog()};
takeAnimals(animals);
takeAnimals(dogs);
        }


        public void takeAnimals(Animal[] animals){
            for(Animal a:animals)
            {
                a.eat();
            }

            //    for(int i=0;i<animals.length;i++)
            // {
            //     Dog o=(Dog)animals[i];
                
            //     o.bark();
            // }
        }

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