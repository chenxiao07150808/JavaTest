package sportDome2;

import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.JLabel;

public class Test2 implements Runnable {

	Test1 test;

	Test2(int x, int y, JLabel jl) {
		test = new Test1(x, y, jl);
	}

	public void run() {
		while (true) {
			test.moving();
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}
