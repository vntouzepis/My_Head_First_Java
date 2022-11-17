public class BitManipulationClass {


public static void main (String[] args){

int x=10;
int y=6;
System.out.println("x=10: "+Integer.toBinaryString(x));
System.out.println("x=~x: "+Integer.toBinaryString(~x));
System.out.println("y=6: "+Integer.toBinaryString(y));
System.out.println("x&y: "+Integer.toBinaryString(x&y));
System.out.println("x|y: "+Integer.toBinaryString(x|y));
System.out.println("x^y: "+Integer.toBinaryString(x^y));
x=-11;
System.out.println("x=-11: "+Integer.toBinaryString(x));
System.out.println("x>>2: "+Integer.toBinaryString(x>>2));
System.out.println("x>>>2: "+Integer.toBinaryString(x>>>2));
System.out.println("x<<2: "+Integer.toBinaryString(x<<2));
x=10;
System.out.println("x>>>2: "+Integer.toBinaryString(x>>>2));

}

}    
