 class test{
	public static void main (String[] args){


	ElectricGuitar eg=new ElectricGuitar();
	System.out.println(eg.brand);
System.out.println(eg.numOfPicks);
System.out.println(eg.rockStarUsesIt);
	String t="fendex";
	eg.setBrand(t);
	eg.setNumOfPicks(6);
	eg.setRockStarUsesIt(true);
t="no fendex";
System.out.println(t);

System.out.println(eg.getBrand());
System.out.println(eg.getNumOfPicks());
System.out.println(eg.getRockStarUsesIt());

ElectricGuitar eg2=new ElectricGuitar();
	eg2.setBrand("alambra");
	eg2.setNumOfPicks(2);
	eg2.setRockStarUsesIt(false);

	System.out.println(eg2.getBrand());
	System.out.println(eg2.getNumOfPicks());
	System.out.println(eg2.getRockStarUsesIt());

	ElectricGuitar eg3=new ElectricGuitar();

	eg3.brand="guernica";
	System.out.println(eg3.brand);
	
int a=eg3.calcArea(7,12);
	System.out.println(a);
short c=7;
int b=eg3.calcArea(c,12);
	System.out.println(b);
	eg3.calcArea(2,3);
	System.out.println(eg3.calcArea(2,3));
long t1=42;

	}
	
 }