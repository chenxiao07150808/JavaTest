package shixun;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		double array[]=new double[5];
		double count=0;
		for(int i=0;i<5;i++){
			System.out.println("�������"+(i+1)+"����");
			Scanner input=new Scanner(System.in);
			array[i]+=input.nextDouble();
			count+=array[i];
		}
System.out.println("5���������ֵĺ�"+count);
	}

}
