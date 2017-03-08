package practiceDome;

class read extends Thread {
	int count = 0;

	public void run() {
		while (true) {
			count++;
			System.out.println(this.getName() + count);
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

class read2 implements Runnable {

	int count = 0;

	public void run() {
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
				}
			}
		}
	}

}
public class ThreadDome2 {

	public static void main(String[] args) {
		read a = new read();
		a.setName("³ÂÏþ");
		a.start();
		read2 b = new read2();
		Thread r = new Thread(b);
		r.setName("ÖÐ¹ú");
		r.start();

	}

}
