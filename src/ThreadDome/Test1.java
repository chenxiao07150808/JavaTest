package ThreadDome;

class Agenty extends Thread  {
	int count = 1;

	public void run() {
		while (true) {
			System.out.println(this.getName() + "销售总数" + count);
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
class leader implements Runnable{

	@Override
	public void run() {
		int count=0;
		while(true){
			count++;
			System.out.println(Thread.currentThread().getName()+"销售"+count);			
			if(count==100){
				break;
			}
			if(count%5==0){
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		Agenty a = new Agenty();
		a.setName("中国");
		a.start();
//		Thread b=new Thread(new leader());//实例化时候要注意先实例化实例类，然后用Thread进行实例
		//b.setName();
		//b.start();
		leader b=new leader();
		Thread c=new Thread(b);
		c.setName("美国");
		c.start();
	}

}
