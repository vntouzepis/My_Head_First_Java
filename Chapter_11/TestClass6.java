public class TestClass6 {

 public static void main(String[] args) {
Washer a=new Washer();

try {
a.foo();

}
catch (ClothingException cex){
   System.out.println("Handle ClothingException");
}
 }


}

class Laundry{
public void doLaundry() throws ClothingException {
    if(3==3)
    throw new ClothingException();

}
}

class Washer{
      Laundry laundry=new Laundry();

public void foo()  throws ClothingException {
laundry.doLaundry();

}
}


class ClothingException extends Exception{}
