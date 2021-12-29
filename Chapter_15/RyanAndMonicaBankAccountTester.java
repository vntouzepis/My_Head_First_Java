class BankAccount{
private int balance=100;

public int getBalance(){
    return balance;
}


public void withdraw(int amount){
    balance=balance-amount;
}}

public class RyanAndMonicaBankAccountTester{


public static void main (String[] args){

MyRunnable myJob=new MyRunnable();

    Thread one = new Thread(myJob);
        Thread two = new Thread(myJob);
one.setName("Ryan");
two.setName("Monica");
one.start();
two.start();
}

}



class MyRunnable implements Runnable{

    private BankAccount account=new BankAccount();

public void run(){
for (int x=0;x<10;x++){
    makeWithdrawal(10);
    if (account.getBalance()<0){
System.out.println("Overdrawn!");
    }
}
}

private void makeWithdrawal(int amount){
if (account.getBalance()>=amount){
    System.out.println(Thread.currentThread().getName()+" is about to withdraw");
    try{
            System.out.println(Thread.currentThread().getName()+" is going to sleep");
Thread.sleep(500);
    }
catch(InterruptedException ex) {ex.printStackTrace();}
            System.out.println(Thread.currentThread().getName()+" woke up");
account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" completes the withdrawal");
            System.out.println(Thread.currentThread().getName()+" "+account.getBalance());

}
else{
     System.out.println("Sorry, not enough for "+Thread.currentThread().getName());

}
}

}