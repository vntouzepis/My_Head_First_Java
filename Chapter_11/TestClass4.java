import java.io.*;

public class TestClass4 {

 public static void main(String[] args)  {

Laundry laundry=new Laundry();
try{
laundry.doLaundry();
}
catch (PantsException ex){
   System.out.println("PantsException");
}
catch (LingerieException ex1) {
   System.out.println("LingerieException");
}
}


}

class Laundry{
public void doLaundry() throws PantsException, LingerieException {
    if(3==3)
    throw new PantsException();
    else
        throw new LingerieException();

}
}



class PantsException extends Exception{}
class LingerieException extends Exception{}