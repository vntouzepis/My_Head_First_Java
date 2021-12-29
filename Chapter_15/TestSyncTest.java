public class TestSyncTest {
public static void main (String[] args){

TestSync job= new TestSync();
Thread a=new Thread(job);
Thread b=new Thread(job);
a.setName("A");
b.setName("B");
a.start();
b.start();
}
}


 class TestSync implements Runnable {
    private int balance;



public void run () {
for (int i=0;i<50;i++){
    increment(); 
// System.out.println("balance is "+balance);
System.out.println("balance is "+balance+" updated from thread "+Thread.currentThread().getName());
}
}


public synchronized void increment(){
    // public void increment(){

int i=balance;
balance=i+1;
// for real check if synchronized works
// System.out.println("synchronized balance is "+balance+" updated from thread "+Thread.currentThread().getName());

}
}