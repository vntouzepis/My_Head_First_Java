class MyRunnable implements Runnable {

    public void run(){
        go();
    }

      public void go(){
              try{
Thread.sleep(5000);}
catch(InterruptedException ex){
    ex.printStackTrace();
}
        doMore();
    }

      public void doMore(){
System.out.println("top o' the stack");
    }
}


public class ThreadTester{

public static void main (String[] args){
    Runnable threadJob=new MyRunnable();
    Thread myThread=new Thread(threadJob);
    myThread.start();
    Thread mySubThread=new SubThread();
    mySubThread.start();
    try{
Thread.sleep(5000);}
catch(InterruptedException ex){
    ex.printStackTrace();
}
System.out.println("back in main");
}
}

class SubThread extends Thread{

public void run(){
        go();
    }

      public void go(){
                      try{
Thread.sleep(5000);}
catch(InterruptedException ex){
    ex.printStackTrace();
}
        doMore();
    }

      public void doMore(){
System.out.println("top o' the stack2");
    }}