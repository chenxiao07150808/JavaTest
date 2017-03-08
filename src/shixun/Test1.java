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
		System.out.println("请输入学号");
		this.no=input.nextInt();
		System.out.println("请输入姓名");
		this.name=input.next();
		System.out.println("请输入成绩");
		this.deg=input.nextInt();
		sum+=deg;
		num++;
	}
	public void disp(){
		System.out.println("学号为"+this.no+" "+ "名字"+this.name+" "+"成绩"+this.deg);
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
