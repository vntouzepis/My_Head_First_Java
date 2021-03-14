import java.util.*;

public class Autoboxing {

 public static void main(String[] args){

ArrayList listOfNumbers=new ArrayList();
listOfNumbers.add(new Integer(3));
Integer one=(Integer)listOfNumbers.get(0);
int intOne=one.intValue();
 System.out.println(intOne); 
 listOfNumbers.add(15);
 int x=(int)listOfNumbers.get(1);
 System.out.println(x); 
Integer a=(Integer)listOfNumbers.get(1);
 System.out.println(a); 

ArrayList listOfNumbers2=new ArrayList();
listOfNumbers2.add(4);
int two=(int)listOfNumbers2.get(0);
System.out.println(two);

ArrayList<Integer> listOfNumbers3=new ArrayList<Integer> ();
listOfNumbers3.add(5);
int three=listOfNumbers3.get(0);
System.out.println(three);
listOfNumbers3.add(new Integer(3));
int k=listOfNumbers3.get(1);
System.out.println(k);
listOfNumbers3.add(7);
int l=(int)listOfNumbers3.get(2);
System.out.println(l);

Integer e=56;
System.out.println(e);
Integer r=new Integer(33);
takeNumber(r);
takeNumber(56);

 }


 static void takeNumber(int i){
System.out.println(i);
 }

}
