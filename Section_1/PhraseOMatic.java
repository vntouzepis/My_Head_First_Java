import java.lang.Math; 
public class PhraseOMatic{
	
	public static void main (String[] args){
	
	String[] wordListOne={"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
	String[] wordListTwo={"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
	String[] wordListThree={"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
	int lengthWordListOne = wordListOne.length;
	int lengthWordListTwo = wordListTwo.length;
	int lengthWordListThree = wordListThree.length;
			
int rand1 = (int)(Math.random() * lengthWordListOne);	
int rand2 = (int)(Math.random() * lengthWordListTwo);				
int rand3 = (int)(Math.random() * lengthWordListThree);							

	String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
	
	
		System.out.println("What we need is a "+phrase);
}}