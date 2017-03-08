package practiceDome;

class A extends Thread {
	int count = 0;

	public void run() {
		while (true) {
			System.out.println(this.getName() + count);
			count++;
			if (count == 100) {
				break;
			}
			if (count % 5 == 0) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class B implements Runnable{

	@Override
	public void run() {
		
		int count=0;
		while(true){
			System.out.println(Thread.currentThread().getName()+count);
			count++;
			if(count==100){
				break;
			}
			if(count%5==0){
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

public class ThreadDome {

	public static void main(String[] args) {

		A a = new A();
		a.start();
		a.setName("³ÂÏþ");
		B b=new B();
		Thread c=new Thread(b);
		c.setName("³¿Ïþ");
		c.start();
		
	}

}
