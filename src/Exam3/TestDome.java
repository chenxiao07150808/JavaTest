package Exam3;

public class TestDome {

	public static void main(String[] args) {
		PlainCircle c=new PlainCircle(20,10,10);
		System.out.println("��Բ���Ϊ��"+c.area());
		System.out.println("��Բ���Ϊ��"+c.perimeter());
		if(c.isInside(25.5, 13)){
		System.out.println("�õ���Բ��");
		}else{
			System.out.println("�õ㲻��Բ��");
	}
	}
}
