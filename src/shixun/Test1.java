package shixun;

import java.util.Scanner;

class stu{
	int no;
	String name;
	int deg;
	static  int sum=0;
     static  int num;
	public void setData(){
		Scanner input =new Scanner(System.in);
		System.out.println("������ѧ��");
		this.no=input.nextInt();
		System.out.println("����������");
		this.name=input.next();
		System.out.println("������ɼ�");
		this.deg=input.nextInt();
		sum+=deg;
		num++;
	}
	public void disp(){
		System.out.println("ѧ��Ϊ"+this.no+" "+ "����"+this.name+" "+"�ɼ�"+this.deg);
	}
	public static void avg(){
		int avg=0;
		avg=(sum/num);
		System.out.println(avg);
	}
}
public class Test1 {
	public static void main(String[] args) {
	stu [] s=new stu[3];
	for(int i=0;i<3;i++){
		s[i]=new stu();
		s[i].setData();
	}
	for(int i=0;i<3;i++){
		s[i].disp();
		
	}
	stu.avg();

	}

}
