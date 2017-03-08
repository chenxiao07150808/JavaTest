package Exam3;

public class Circle {
protected double r;

public Circle(double r) {
	super();
	this.r = r;
}

public Circle() {
	this.r=10;
}
public  double area(){
	return this.r*this.r*3.14;
}
public double perimeter(){
	return this.r*2*3.14;
}

}
