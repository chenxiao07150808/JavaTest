package practiceDome;

import java.util.Scanner;

public class ’€∞Î—∞’“ {

	public static void main(String[] args) {
	 int a[]={12,24,37,39,40,56};
	 int left=0;int right=a.length-1;
	 int aid=(left+right)/2;
	 int index=-1;
	 Scanner input=new Scanner(System.in);
	 int num=input.nextInt();
	 while(left<right){
		 if(num==a[aid]){
			 index=aid;
			 break;
		 }else if(num>a[aid]){
			 right=(aid-1)/2;
		 }else if(num<a[aid]){
			 left=(aid+1)/2;
		 }
	 if(index==-1){
		 System.out.println("√ª”–’“µΩ");
	 }else{
		 System.out.println();
	 }
	 }
	 

	}

}
