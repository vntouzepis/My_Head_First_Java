class GoodDog{
private int size;

public int getSize(){
	return size;
}

public void setSize(int s){
	size=s;;
}

void bark(){
	if (size>60){
	System.out.println("woof!woof!");}
	else if (size>14){
	System.out.println("ruff!ruff!");}
		else {
	System.out.println("yip!yip!");}
}

}