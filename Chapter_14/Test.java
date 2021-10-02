import java.util.*;

public class Test{

private int width;
private int height;

public void setWidth(int w){
    width=w;
}

public void setHeight(int h){
    height=h;
}

    public static void main(String[] args){
ArrayList arl=new ArrayList();
Test a=new Test();
arl.add(a);
Test b=(Test)arl.get(0);
Object ob=new Object();
ob=b;

    }
}