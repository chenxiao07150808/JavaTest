package practiceDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.crypto.Data;

public class ThreadDome22 extends JFrame implements Runnable, ActionListener {
	JButton jb, jb2;
	JLabel jl;
	Thread thread;
	boolean flag = true;

	ThreadDome22() {
		jb = new JButton("开始计时！");
		jb2 = new JButton("停止");
		jl = new JLabel("");
	}

	void init() {
		this.setVisible(true);
		this.setSize(250, 250);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jb);
		this.add(jb2);
		this.add(jl);
		jb.addActionListener(this);
        jb2.addActionListener(this);
	}

	public static void main(String[] args) {
ThreadDome22 a=new ThreadDome22();
a.init();
	}

	public void run() {
		while (true) {
			if (flag) {
				Date date = new Date();
				jl.setText(date.toLocaleString());
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb)) {
        if(thread==null){
        	thread=new Thread(this);
        	thread.start();
        }
		}else if(e.getSource().equals(jb2)){
		  flag=!flag;
		}
	}

}
