package shixun;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Test extends Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =3;
		char e='5';
		System.out.println(e);
		char f=(char)(d+e);
		System.out.println(f);
		//ѡ����1
		System.out.println("char�Ĵ�С"+Character.SIZE);
		System.out.println("int�Ĵ�С"+Integer.SIZE);
		System.out.println("long�Ĵ�С"+Long.SIZE);
		System.out.println("short�Ĵ�С"+Short.SIZE);
		System.out.println("byte�Ĵ�С"+Byte.SIZE);
		
		//ѡ�����5��
		System.out.println("java�������".length()+"����");
		
		
		//ѡ�����6��
		//byte a=1;
		char a='a';
		//long a=1;
		switch(a)
		{
		case 1:
			break;
		default:
			
		}
		
		// ѡ�����7��
		int x=5,y=7,u=9,v=6;
		System.out.println(x>y? x+2:u>v?u-3:v+2);
		
	    //ѡ����12,�����ͣ�ں��������߲��ֲᣬ���Կ�����ϸ�����뺯������
		String s="0123456789";
		String s1=s.substring(2);
		String s2=s.substring(2,5);
		System.out.println(s1+s2);

		//��23��,ASCII�ַ����ֵ
		int aa=3;
		char b='5';
		char c=(char)(aa+b);
		System.out.println(c);
		
		//ѡ����26��
		Parent p=new Parent("south","north");
		Parent t=new Child("east","west");
		
		p.print();
		t.print();
		
		Test test=new Test();
		
		
	}
	
	public  Test()
	{
		Button HelloButton=new Button("hello");
		Button ByeButton=new Button("Bye");
		add(HelloButton);
		//Ĭ�ϵڶ�����Ϊ����
		//add(HelloButton,BorderLayout.CENTER);
		add(ByeButton);
		setSize(300,300);
		setVisible(true);
		//���frame��Ĭ�ϲ�����ava.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println(this.getLayout());
		String s="ABCDEFGHIJABC";
		System.out.println(s.indexOf("A",7));
		System.out.println(s.indexOf("EFG",2));
	}

}
