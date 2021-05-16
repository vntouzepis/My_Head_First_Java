public class TestClass5 {

 public static void main(String[] args)  {

Laundry laundry=new Laundry();
try{
laundry.doLaundry();
}
catch (TeeShirtException tex){
   System.out.println("Handle TeeShirtException");
}
catch (ShirtException lex) {
   System.out.println("Handle ShirtException");
}
catch (LingerieException lex) {
   System.out.println("Handle LingerieException");
}
catch (ClothingException cex){
   System.out.println("Handle ClothingException");
}
}


}

class Laundry{
public void doLaundry() throws ClothingException {
    if(3==3)
    throw new TeeShirtException();
    else
        throw new LingerieException();

}
}


class ClothingException extends Exception{}
class PantsException extends ClothingException{}
class LingerieException extends ClothingException{}
class ShirtException extends ClothingException{}
class TeeShirtException extends ShirtException{}
class DressShirtException extends ShirtException{}