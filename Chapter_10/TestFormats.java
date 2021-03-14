import java.util.Date;



public class TestFormats {

 public static void main(String[] args){

String s=String.format("%,d",1000000000);
System.out.println(s);  
String s1=String.format("I have %.2f bugs to fix",476578.09876);
System.out.println(s1); 
String s2=String.format("I have %,.2f bugs to fix",476578.09876);
System.out.println(s2); 
String s3=String.format("I have %.2f, bugs to fix",476578.09876);
System.out.println(s3);
String s4=String.format("%,6.1f",42.000);
System.out.println(s4);  
String s5=String.format("%,5.1f",42.000);
System.out.println(s5); 
String s6=String.format("%,4.1f",42.000);
System.out.println(s6);
String s7=String.format("%,3.1f",42.000);
System.out.println(s7); 
double d=23.4;
int x=(int)d;   
System.out.println(x); 
System.out.println(String.format("%d",42)); 
System.out.println(String.format("%.3f",42.000000)); 
System.out.println(String.format("%.3f",d));
Double d1=new Double(123.123222);
System.out.println(String.format("%.3f",d1)); 
System.out.println(String.format("%x",42)); 
System.out.println(String.format("%c",42));
char c='*'; 
// System.out.println(String.format("%d",c)); 
int a=c;
System.out.println(a); 
System.out.println(String.format("%,6.1f",42.000)); 
System.out.println(String.format("%6.1f",42.000)); 
System.out.println(String.format("%c",'0'));
// System.out.println(String.format("%d",'a'));

System.out.println(Character.isValidCodePoint(45));
System.out.println(String.format("%c",'-'));
System.out.println(String.format("%d",4));
byte b=89;
System.out.println(String.format("%d",b));

int one=20456654;
double two=100567890.248907;
System.out.println(String.format("The rank is %,d out of %,.2f",one,two));
System.out.println(String.format("%tc",new Date()));
System.out.println(String.format("%tr",new Date()));
Date today=new Date();
System.out.println(String.format("%tA, %tB %td",today,today,today));
System.out.println(String.format("%tA, %<tB %<td",today));
System.out.println(today);


 }
}
