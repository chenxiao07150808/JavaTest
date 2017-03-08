package shixun;



public class Child extends Parent{

	public Child(String a,String b)
	{
		super(a,b);
	}
	
	public void print()
	{
		System.out.println(one+" to "+two);
	}
	
}

class Parent{
	String one,two;
	
	public Parent(String a,String b){
		one=a;
		two=b;
	}
	
	public void print()
	{
		System.out.println(one);
	}
}
