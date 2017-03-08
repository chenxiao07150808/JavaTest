package practiceDome;

public class RunCDome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 class b extends Thread{
	
		public void run() {
			while(true){
				
		}
	}
 }
	class a implements Runnable {
		public void run() {

			// TODO Auto-generated method stub
			int count = 0;
			while (true) {
				count++;
				System.out.println(Thread.currentThread().getName() + count);
				if (count == 100) {
					break;
				}
				if (count % 5 == 0) {
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
}
