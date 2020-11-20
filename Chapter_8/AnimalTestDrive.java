 import java.util.*;
 class AnimalTestDrive{
	public static void main (String[] args){
MyAnimalList list=new MyAnimalList();
Dog a=new Dog();
Cat c=new Cat();
list.add(a);
list.add(c);
Animal an=new Dog();
//System.out.println(a.equals(c));
//System.out.println(a.getClass());
//System.out.println(a.hashCode());
//System.out.println(a.toString());
//System.out.println(an.getClass());
//ArrayList<Dog> myDogArrayList=new ArrayList<Dog>();
//Dog aDog=new Dog();
//myDogArrayList.add(aDog);
//Dog d=myDogArrayList.get(0);
ArrayList<Object> myDogArrayList=new ArrayList<Object>();
Dog aDog=new Dog();
myDogArrayList.add(aDog);
Dog d=myDogArrayList.get(0);



    }

	}

	

  

