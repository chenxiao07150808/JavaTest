package Exam3;

public class PlainCircle extends Circle{
 protected double cX,cY;

public PlainCircle(double r, double cX, double cY) {
	super(r);
	this.cX = cX;
	this.cY = cY;
}

public PlainCircle() {
this.cX=0;
this.cY=0;
this.r=10;
}
public boolean isInside(double x,double y){
	if((x-cX)*(x-cX)+(y-cY)*(y-cY)<=r*r){
		return true;
	}else{
		return false;
	}
}


}
