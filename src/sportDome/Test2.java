package sportDome;

import javax.swing.JLabel;

public class Test2 extends Thread {

Test test;
Test2 (int x,int y,JLabel jl){
	 test=new Test(x,y,jl);
}
public void run() {
	while(true){
		test.moving();
		try {
			sleep(100);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
}
//主要是通过构造方法进行对小球位置的情况获取具体的值，方便在后面的调用，同时实现多线程的实例化/。