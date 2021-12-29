public class TestThreads  {

    public static void main(String[] args){
ThreadOne t1=new ThreadOne();
ThreadTwo t2=new ThreadTwo();
Thread one=new Thread(t1);
Thread two=new Thread(t2);
one.start();
two.start();
    }
    
}


class ThreadOne implements Runnable{

    public void run(){
        Accum a=Accum.getAccum();
         for(int x=0;x<98;x++){
                    a.updateCounter(1000);
                    try{
Thread.sleep(50);
}
 catch(InterruptedException ex){}
                }
System.out.println("one "+a.getCount());

    }
}


class ThreadTwo implements Runnable{

    public void run(){
                Accum a=Accum.getAccum();
                for(int x=0;x<99;x++){
                    a.updateCounter(1);
                    try{
Thread.sleep(50);
}
 catch(InterruptedException ex){}
                }
System.out.println("two "+a.getCount());
            

    }
}



class Accum{
    private int counter=0;
        private static Accum a=new Accum();

private Accum(){}
    public static Accum getAccum(){
        return a;
    }


// updateCounter method is not really an atomic process: 
// READ counter
// ADD counter, add
// WRITE counter 
    public synchronized void updateCounter(int add){

    // public void updateCounter(int add){
        counter+=add;
    }

    public int getCount(){
return counter;
    }
}
