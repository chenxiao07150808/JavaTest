package shixun;

import java.util.Date;

class ThreadDome extends Thread {
	int timeSleep;
	String ThreadName;

	ThreadDome(int timeSleep, String Threadname) {
		this.timeSleep = timeSleep;
		this.ThreadName = Threadname;
	}

	@Override
	public void run() {
		int count = 5;
		while (count > 0) {
			count--;
			System.out.println(ThreadName + " " + new Date().toString());
			try {
				sleep(timeSleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam19 {

	public static void main(String[] args) {
		ThreadDome one = new ThreadDome(1000, "One Thread");
		one.start();
		ThreadDome two = new ThreadDome(3000, "two Thread");
		two.start();
	}

}
