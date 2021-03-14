import java.util.Calendar;
import static java.lang.System.out;
import static java.lang.Math.*;

public class MyCalendar {

 public static void main(String[] args){


Parent p=new Child();
Child c=new Child();
p.meth();
c.meth();

Parent p1=c;
p1.meth();
System.out.println(c.a); 
System.out.println(p.a); 
System.out.println(c.b); 

Calendar cal=Calendar.getInstance();
    cal.set(2004,0,7,15,40); 
    System.out.println(cal.getTime()); 
   
long day1=cal.getTimeInMillis();
    System.out.println(day1); 
   
day1+=1000*60*60;
cal.setTimeInMillis(day1);
System.out.println("new hour "+cal.get(cal.HOUR_OF_DAY));
cal.add(cal.DATE,35); 
System.out.println("add 35 days "+cal.getTime());
cal.roll(cal.DATE,35); 
System.out.println("roll 35 days "+cal.getTime());
cal.set(cal.DATE,1);
System.out.println("set to 1 "+cal.getTime());
System.out.println("sqrt "+Math.sqrt(2.0));
System.out.println("tan "+Math.tan(60));
out.println("sqrt "+sqrt(2.0));
System.out.println(abs(6.3)); 

 }

}


abstract class Parent{

    int a=1;

public void meth(){
    System.out.println("parent"); 
 
}

}

class Child extends Parent{
    int b=5;

public void meth(){
    System.out.println("child"); 
 
}

public void meth2(){
    System.out.println("child2"); 
 
}

}
