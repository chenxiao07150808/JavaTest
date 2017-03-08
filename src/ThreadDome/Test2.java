package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test2 extends JFrame implements ActionListener, Runnable {
	JLabel jl;
	JButton jb1, jb2;
	boolean flag = true;
	Thread thread = null;

	Test2() {
		jl = new JLabel();
		jb1 = new JButton("开始计数");
		jb2 = new JButton("切换");

	}

	void init() {
		this.setSize(200, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jl);
		this.add(jb1);
		this.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.init();
	}

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
	public void run() {
		int count = 0;
		while (true) {
			if (flag) {
				jl.setText(count + " ");
				count++;
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
