 
 class TestDrive3{
	public static void main (String[] args){

 
       Base base = new Base(); 
       base.fun(); 
  
       Derived derived = new Derived(); 
       derived.fun(); 

	  Base a= new Base();
	          System.out.println(a.turnOn()); 

	 
	 Derived b= new Derived();
	          System.out.println(b.turnOn()); 		  

		Base c= new Derived();
	          System.out.println(c.turnOn()); 	  
    }

	}

	class A {} 
class B extends A {} 
	
	class Base 
{ 
    A fun() 
    { 
        System.out.println("Base fun()"); 
        return new A(); 
    } 
	
	boolean turnOn(){
return false;
	}
} 
  
class Derived extends Base 
{ 
    B fun() 
    { 
        System.out.println("Derived fun()"); 
        return new B(); 
    } 
		boolean turnOn(int level){
return true;

		}
//		boolean turnOn(){
//return true;
//	}

} 
