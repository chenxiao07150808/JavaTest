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
//��Ҫ��ͨ�����췽�����ж�С��λ�õ������ȡ�����ֵ�������ں���ĵ��ã�ͬʱʵ�ֶ��̵߳�ʵ����/��