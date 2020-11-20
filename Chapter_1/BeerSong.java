public class BeerSong{
	
	public static void main (String[] args){
	
		for (int x=4;x>0;x=x-1){
		if (x>1){			
		System.out.println(x +" bottles of beer on the wall,");
		System.out.println(x +" bottles of beer.");
		}
		else 		{
		System.out.println(x +" bottle of beer on the wall,");
		System.out.println(x +" bottle of beer.");
		}
		System.out.println("Take one down, pass it around,");
		
		if (x-1>1)
		System.out.println(x-1 +" bottles of beer on the wall.\n");
		else if (x-1==1)
		System.out.println(x-1 +" bottle of beer on the wall.\n");
		else if (x-1==0){
		System.out.println("No more bottles of beer on the wall.\n");		
		System.out.println("No more bottles of beer on the wall,");
		System.out.println("No more bottles of beer.");
		System.out.println("Go to the store and buy some more, 4 bottles of beer on the wall."); }}}}