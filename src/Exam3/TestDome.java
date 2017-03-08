package Exam3;

public class TestDome {

	public static void main(String[] args) {
		PlainCircle c=new PlainCircle(20,10,10);
		System.out.println("该圆面积为："+c.area());
		System.out.println("该圆面积为："+c.perimeter());
		if(c.isInside(25.5, 13)){
		System.out.println("该点在圆内");
		}else{
			System.out.println("该点不在圆内");
	}
	}
}
