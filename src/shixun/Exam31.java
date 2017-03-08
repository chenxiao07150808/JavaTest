package shixun;

import java.util.Scanner;

public class Exam31 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("请输入你要打印的行数");
		int num=input.nextInt();
		int array[][]=new int [num][num];
		array[0][0]=1;
		for(int i=0;i<num;i++){
			array[i][0]=1;
			for(int j=1;j<=i;j++){
				array[i][j]=array[i-1][j]+array[i-1][j-1];
			}
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}

}
