package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeDome extends JFrame implements Runnable, ActionListener {
	JLabel jl;
	JButton jb1, jb2;
	Thread thread;
	Boolean flag = true;

	TimeDome() {
		jl = new JLabel("");
		jb1 = new JButton("开始计数");
		jb2 = new JButton("切换");

	}

	void init() {
		this.setVisible(true);
		this.setSize(250, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jl);
		this.add(jb1);
		this.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	public static void main(String[] args) {
		TimeDome time = new TimeDome();
		time.init();

	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				Date date = new Date();
				jl.setText(date.toLocaleString());
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb1)) {
			if (thread == null) {
				thread = new Thread(this);
				thread.start();
			}
		} else if (e.getSource().equals(jb2)) {
			flag = !flag;
		}

	}

}
