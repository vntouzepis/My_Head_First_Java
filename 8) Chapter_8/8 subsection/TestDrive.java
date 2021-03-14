 import java.util.*;
 
 class TestDrive{
	public static void main (String[] args){

ArrayList<Object> myAnimalArrayList=new ArrayList<Object>();
Dog d=new Dog();
Animal an=new Animal();
myAnimalArrayList.add(d);
myAnimalArrayList.add(an);


Object o=myAnimalArrayList.get(0);
if (o instanceof Dog){
Dog d1=(Dog)o;
d1.shout();}
Object o2=myAnimalArrayList.get(1);
if (o2 instanceof Animal){
Animal an2=(Animal)o2;
an2.shout();
an2.shout1();

}
Animal an3=d;
an3.shout();

Animal k1=new Dog();
Dog l1=(Dog)k1;


//Animal k2=new Animal();
//Dog l2=(Dog)k2;

Animal m=new Dog();
Dog l=(SubDog)m;
l.shout();

//myAnimalArrayList.get(0).shout();
//ArrayList<Animal> myAnimalArrayList1=new ArrayList<Animal>();
//myAnimalArrayList1.add(d);
//myAnimalArrayList1.add(an);  
//myAnimalArrayList1.get(0).shout();
//myAnimalArrayList1.get(1).shout();
//System.out.println(myAnimalArrayList1.get(0).hashCode());
//System.out.println(myAnimalArrayList1.get(1).hashCode());
    }

	}
 class Animal{
	 public void shout(){
	 System.out.println("annnnn!!!");
	 }
	 //	 public int hashCode(){
	 //return 1;
	// }
 }
	 class Dog extends Animal {
		 
	 public void shout(){
	 System.out.println("wooooof!!!");
	 }		 

	 	 public int hashCode(){
	 return 2;
	 }	 
		 
	 } 
	
	 class SubDog extends Dog {
		 
	 public void shout(){
	 System.out.println("SubDoggggg!!!");
	 }		 

		 
	 } 
  
