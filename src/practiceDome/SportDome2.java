package practiceDome;

import javax.swing.JLabel;

public class SportDome2 extends Thread {
    sportDome test;

	public SportDome2(int x,int y,JLabel jl) {
	test=new sportDome(x, y, jl);
	}
	
	public void run() {
		while(true){
			test.moving();
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
