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
		//选择题1
		System.out.println("char的大小"+Character.SIZE);
		System.out.println("int的大小"+Integer.SIZE);
		System.out.println("long的大小"+Long.SIZE);
		System.out.println("short的大小"+Short.SIZE);
		System.out.println("byte的大小"+Byte.SIZE);
		
		//选择题第5题
		System.out.println("java程序设计".length()+"长度");
		
		
		//选择题第6题
		//byte a=1;
		char a='a';
		//long a=1;
		switch(a)
		{
		case 1:
			break;
		default:
			
		}
		
		// 选择题第7题
		int x=5,y=7,u=9,v=6;
		System.out.println(x>y? x+2:u>v?u-3:v+2);
		
	    //选择题12,鼠标悬停在函数，或者查手册，可以看到详细参数与函数意义
		String s="0123456789";
		String s1=s.substring(2);
		String s2=s.substring(2,5);
		System.out.println(s1+s2);

		//第23题,ASCII字符码的值
		int aa=3;
		char b='5';
		char c=(char)(aa+b);
		System.out.println(c);
		
		//选择题26题
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
		//默认第二参数为居中
		//add(HelloButton,BorderLayout.CENTER);
		add(ByeButton);
		setSize(300,300);
		setVisible(true);
		//输出frame的默认布局器ava.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println(this.getLayout());
		String s="ABCDEFGHIJABC";
		System.out.println(s.indexOf("A",7));
		System.out.println(s.indexOf("EFG",2));
	}

}
