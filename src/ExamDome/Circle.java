package ExamDome;

public class Circle {
  protected double r;
  
  public Circle() {
	r=10;
  }
  
public Circle(double r) {
	this.r = r;
}
  public double area(){
	return this.r*this.r*3.14;
}

public double perimeter(){
	return this.r*2*3.14;
	  
}

}
class planCircle extends Circle{
	protected double cX,cY;
	
	 public planCircle(double cX, double cY,double r) {
		super();
		this.cX = cX;
		this.cY = cY;
		this.r=r;
	}

	planCircle() {
	cX=0;
	cY=0;
	r=10;
	}
	public boolean isInside(double x,double y){
		if((x-this.cX)*(x-this.cX)+(y-cY)*(y-cY)<r*r){
			return true;
		}else{
		return false;
		}
	}
}
class PlainCircle{
	public static void main(String[] args) {
		planCircle a=new planCircle(10, 10, 20);
	double area=a.area();
	double perimerter=a.perimeter();
	System.out.println("面积为"+area+"周长为"+perimerter);
	boolean c=a.isInside(25.5, 13);
	if(c){
		System.out.println("存在圆内");
	}else{
		System.out.println("不存在");
	}
		
	}
}