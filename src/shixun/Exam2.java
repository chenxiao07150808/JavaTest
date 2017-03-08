package shixun;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		double array[]=new double[5];
		double count=0;
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			Scanner input=new Scanner(System.in);
			array[i]+=input.nextDouble();
			count+=array[i];
		}
System.out.println("5个输入数字的和"+count);
	}

}
