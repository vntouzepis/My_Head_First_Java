    public class StaticNestedClass2 {
       public static void main(String[] args) {  

    StaticNestedClass2 outer=new StaticNestedClass2();
    outer.meth();
            // FooOuter.BarInner foo=new FooOuter.BarInner();
            // foo.sayIt();
       }  


void meth(){
       BarInner inner=new BarInner();
inner.sayIt();
}

              static class BarInner{
         void sayIt(){
            System.out.println("method of a static inner class");  

      }
    }
    }