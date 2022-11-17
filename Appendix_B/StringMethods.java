public class StringMethods {


public static void main (String[] args){


StringBuffer sb=new StringBuffer("Dokimi");
System.out.println(sb.substring(2,4));
System.out.println(sb);
System.out.println(sb.append("fgh"));
System.out.println(sb);

String str = "knowledge";
System.out.println(str.substring(2,4));
System.out.println(str);
System.out.println(str.concat("fgh"));
System.out.println(str);
str=str.concat("123");
 System.out.println(str);
 

}

}    
