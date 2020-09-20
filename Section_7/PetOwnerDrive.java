 
 class PetOwnerDrive{
	public static void main (String[] args){

 	Vet v=new Vet();
	Hippo h=new Hippo();
	Dog d=new Dog();
	Animal an=new Animal();
//v.giveShot(h);
//v.giveShot(d);
//v.giveShot(an);
//v.giveShot1(an);

	


Animal	k=v.mymeth(); 	  	
v.giveShot(k);


//Animal l=v.mymeth2(); 	  	
//v.giveShot(l);

    }

	}

	class Vet {
	public void giveShot(Animal a){
a.makeNoise();
	}	
	

	public Animal mymeth(){
	Hippo h=new Hippo();
	Dog d=new Dog();
	Animal an=new Animal();	
return d;
	}		
	
	
	public Hippo mymeth2(){
	Hippo h=new Hippo();
	Dog d=new Dog();
	Animal an=new Animal();	
return h;
	}	
	
		public void giveShot1(Animal a){
a.makeNoise();
	}

} 


class Animal{
	void makeNoise(){
     System.out.println("animal general shouting"); 	  	
	}
}
class Hippo extends Animal{
		void makeNoise(){
     System.out.println("ouuuuuuuuu!!! (hippo)"); 	  	
	}
}
class Dog extends Animal{
		void makeNoise(){
     System.out.println("grrrrr!!! (dog)"); 	  	
	}
}
