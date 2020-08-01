class ElectricGuitar{
String  brand;
int numOfPicks;
boolean rockStarUsesIt;

String getBrand(){
return brand;
}

void setBrand(String aBrand){
	brand=aBrand;
}

int getNumOfPicks(){
return numOfPicks;
}

void setNumOfPicks(int num){
	if(num>2)
	numOfPicks=num;
}

boolean getRockStarUsesIt(){
return rockStarUsesIt;
}

void setRockStarUsesIt(boolean yesOrNo){
	rockStarUsesIt=yesOrNo;
}


int calcArea(int h, int w){
return h*w;
}


}