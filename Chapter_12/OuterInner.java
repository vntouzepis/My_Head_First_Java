public class OuterInner {


    public static void main (String[] argv)
    {
MyOuter outer=new MyOuter();
// MyOuter.MyInner innerObj=outer.new MyInner();
// innerObj.doStuff();
outer.doStuff();


    }

}


class MyOuter{

private int x;
// MyInner inner=new MyInner();

public void doStuff(){
    MyInner inner=new MyInner();
    System.out.println(inner.y);
    inner.go();
}

public void doStuff2(){
    // MyInner inner=new MyInner();

    System.out.println("ggggggggggggggggggg");
}
    class MyInner{
        private int y=10;

void go(){
    x=42;
    System.out.println(x);
    doStuff2();
}

    }
}