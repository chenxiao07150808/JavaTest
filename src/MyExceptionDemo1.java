import java.util.Scanner;

class MyException extends Exception{
	public void print(){
		System.out.println("�������������0");
	}
	
}
class MyException1 extends Exception{
	public void print(){
		System.out.println("�������������5");
	}
}
class MyMath{
	public double caculate(int x) throws MyException, MyException1{
		
		if(x<0){
			throw new MyException();
		}else if(x<5){
			throw new MyException1();
			}else{
		 return Math.sqrt(x);
		}
	}
class MyMath1{
		public double caculate(int x) throws MyException1{
			
			if(x<5){
				throw new MyException1();
			}else{
			 return Math.sqrt(x);
			}
		}
}

}
public class MyExceptionDemo1 {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println("���������֣�");
		MyMath mymath=new MyMath();
		try {
			System.out.println(mymath.caculate(x));
		} catch (MyException e) {
			e.print();
		}catch(MyException1 e){
			e.print();
		}
	
	}

}
