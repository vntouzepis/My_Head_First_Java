 import java.util.*;//1
 
 class ArrayListMagnet{//2
	 
	public static void main (String[] args){//3
ArrayList<String> a=new ArrayList<String>();//4
	a.add(0,"zero");//5
	a.add(1,"one");//5
	a.add(2,"two");//6
	a.add(3,"three");//7	
printAL(a);//7
	a.remove(2);//8
	
	if (a.contains("three")){//9
	a.add("four");}//9
	printAL(a);//10
	
	
	if (a.indexOf("four")!=4){//11
			a.add(4,"4.2");}//11
printAL(a);//12

	if (a.contains("two")){//13
			a.add("2.2");}//13
printAL(a);//14
	
	}//15
		public static void printAL(ArrayList<String> al){//16
	
	for (String element:al){ //17
	
	System.out.print(element+ " ");//18
	}//18
	System.out.println(" ");//18
	
	}//19
	}//20
