    public class BlockScope {  
       public static void main(String[] args) {  
         BlockScope myBlockScope=new BlockScope();
         myBlockScope.doStuff();
       }  

 void doStuff(){
int x=0;
for (int y=0;y<5;y++){
   x=x+y;
}
x=x*y;
}
    }  
