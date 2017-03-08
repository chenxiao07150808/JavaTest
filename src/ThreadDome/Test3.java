package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test3 extends JFrame implements ActionListener,Runnable {
JButton jb1,jb2,jb3;
JLabel jl1;
int count;
Thread thread=null;
	public  Test3(){
	jb1=new JButton("¿ªÊ¼");
	jb2=new JButton("Í£Ö¹");
	jb3=new JButton("ÖØÖÃ");
	JPanel jp=new JPanel();
	jl1=new JLabel("00:00:00");
	jp.add(jl1);
	jp.add(jb1);
	jp.add(jb2);
	jp.add(jb3);
	this.add(jp);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(350,350);
	this.setLayout(new FlowLayout());
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
}
	public static void main(String[] args) {
		Test3 test=new Test3();
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			if(thread==null){
				thread=new Thread(this);
			thread.start();
			}
		}else if(e.getSource().equals(jb2)){
			if(thread != null){
				thread.stop();
				thread=null;
			}
		}else if(e.getSource().equals(jb3)){
			if(thread!=null){
			count=0;
			jl1.setText("00:00:00");
			thread.stop();
			thread=null;
			}
		}
		
	}
	@Override
	public void run() {
		while(true){
			count++;
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int hour=count/3600;
			int min=count%3600/60;
			int s=count%60;
			String Hour=(hour>9)?hour+"":"0"+hour;
			String Min=(min>9)?min+"":"0"+min;
			String S=(s>9)?s+"":"0"+s;
			jl1.setText(Hour+":"+Min+":"+S);
		}
	}

}
