package shixun;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		int []a={12,34,45,56,67};
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ�ҵ���");
		int num=input.nextInt();
		int left=0;
		int right=a.length-1;
        int index=-1;
        while(left<right){
        	int aid=(left+right)/2;
		if(num==a[aid]){
			index=aid;
			break;
		}else if(num>a[aid]){
			left=aid+1;
		}else  if(num<a[aid]){
			right=aid-1;
		}
        }
        if(index==-1){
        	System.out.println("û���ҵ�");
        }else {
        	System.out.println("�ҵ�"+index+1);
        }

	}

}
