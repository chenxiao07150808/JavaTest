package shixun;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int array[][]=new int[num][num];
		array[0][0]=1;
		for(int hang =0;hang<num;hang++){
			array[hang][0]=1;
			for(int lie=1;lie<=hang;lie++){
				array[hang][lie]=array[hang-1][lie]+array[hang-1][lie-1];
			}
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<i;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
