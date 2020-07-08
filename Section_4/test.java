 class test{
	public static void main (String[] args){

	
	ElectricGuitar eg=new ElectricGuitar();
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
	eg2.setNumOfPicks(5);
	eg2.setRockStarUsesIt(false);

System.out.println(eg2.getBrand());
System.out.println(eg2.getNumOfPicks());
System.out.println(eg2.getRockStarUsesIt());

ElectricGuitar eg3=new ElectricGuitar();

eg3.brand="guernica";
System.out.println(eg3.brand);

	}
	

 }