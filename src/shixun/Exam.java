package shixun;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
	int digital=0;
	int character=0;
	int other=0;
	int blank=0;
	char[]ch=null;
	Scanner input=new Scanner(System.in);
	System.out.println("����������");
	String str=input.next();
	ch=str.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(ch[i]>='0'&&ch[i]<='9'){
			digital++;
		}else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z'){
			character++;
		}else if(ch[i]==' '){
			blank++;
		}else {
			other++;
		}
	}
	  System.out.println("���ָ���: " + digital);
	     System.out.println("Ӣ����ĸ����: " + character);
	     System.out.println("�ո����: " + blank);
	     System.out.println("�����ַ�����:" + other );
	}

}
