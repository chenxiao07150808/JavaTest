package shixun;

import java.util.Scanner;

public class Exam27 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("����������");
		char ch[];
		String str=input.nextLine();
		ch=str.toCharArray();
		int number=0;
		int zimu=0;
		int kongbai=0;
		int other=0;
		for(int i=0;i<str.length();i++){
			if(ch[i]>='0'&&ch[i]<='9'){
				number++;
			}else if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')){
				zimu++;
			}else if(ch[i]==' '){
				kongbai++;
			}else{
				other++;
			}
		}
		System.out.println("���ֵĸ���"+number);
		System.out.println("��ĸ�ĸ���"+zimu);
		System.out.println("�ո�ĸ���"+kongbai);
		System.out.println("�����ĸ���"+other);

	}

}
