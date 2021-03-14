public class WrapperMethods {

 public static void main(String[] args){

String s="2";
int x=Integer.parseInt(s);
double d=Double.parseDouble("420.24");
boolean b=Boolean.parseBoolean("True");
System.out.println(x);  
System.out.println(d);  
System.out.println(b);  
String t="two";
// int y=Integer.parseInt(t);
// System.out.println(y);  

double e=42.4;
String doubleString=Double.toString(e);
System.out.println(doubleString);  
String doubleString2=""+e;
System.out.println(doubleString2); 

 }


}
