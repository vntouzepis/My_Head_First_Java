 import java.util.*;
 
 class TestDrive{
	public static void main (String[] args){

ArrayList<Egg> myList=new ArrayList<Egg>();
Egg a=new Egg();
myList.add(a);
Egg b=new Egg();
myList.add(b);
int theSize=myList.size();
System.out.println(theSize);
boolean isIn=myList.contains(a);
System.out.println(isIn);
int idx=myList.indexOf(b);
System.out.println(idx);


boolean empty=myList.isEmpty();
System.out.println(empty);
myList.remove(a);
myList.remove(b);
System.out.println(empty);

empty=myList.isEmpty();
System.out.println(empty);



String[] myList1=new String[2];
String a1=new String("whohoo");
myList1[0]=a1;
String b1=new String("Frog");
myList1[1]=b1;
myList1=new String[1];
myList1[0]=a1;
b1=new String("whohoo");
if (b1==myList1[0])
	System.out.println(true);
else 
	System.out.println(false);


if (b1.equals(myList1[0]))
	System.out.println(true);
else 
	System.out.println(false);
	

	Egg myEgg=null;
	if (myEgg!=null && myEgg.isFresh())
	//if (myEgg.isFresh())
		//if (myEgg.isFresh()&&myEgg!=null)
	
		System.out.println("fresh");
    else
		System.out.println("not fresh");
	

	}

	}
