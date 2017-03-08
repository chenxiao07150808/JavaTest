package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeDome3 extends JFrame implements ActionListener, Runnable {
	JButton jb1, jb2;
	JLabel jl;
	Thread thread = null;

	TimeDome3() {
		jb1 = new JButton("开始计时");
		jb2 = new JButton("暂停");
		jl = new JLabel("1");
		this.setVisible(true);
		this.setSize(350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jl);
		this.add(jb1);
		this.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeDome3 test = new TimeDome3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb1)) {
			if (thread == null) {
                thread=new Thread(this);
                thread.start();
			}
		}else if(e.getSource().equals(jb2)){
			if(thread!=null){
				thread.stop();
				thread=null;
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Date date = new Date();
			jl.setText(date.toLocaleString());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
