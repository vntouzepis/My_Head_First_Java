public class BeerSong_book{
	
	public static void main (String[] args){
	
	int beerNum=4;
	String word="bottles";
	while(beerNum>0){
		//if (beerNum==1){
		//	word="bottle";// singular, as in ONE bottle.
		//}
			System.out.println(beerNum+" "+word +" of beer on the wall,");
			System.out.println(beerNum+" "+word +" of beer.");
		System.out.println("Take one down, pass it around,");
			beerNum=beerNum-1;
		if (beerNum==1){
			word="bottle";// singular, as in ONE bottle.
		}
		
			if (beerNum>0){
			System.out.println(beerNum+" "+word +" of beer on the wall.\n");}
			else {
		System.out.println("No more bottles of beer on the wall.\n");		
		System.out.println("No more bottles of beer on the wall,");
		System.out.println("No more bottles of beer.");
		System.out.println("Go to the store and buy some more, 4 bottles of beer on the wall.");}}}}