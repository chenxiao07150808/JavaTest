package shixun;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam9 extends JFrame implements ActionListener,Runnable {
	JButton jb1,jb2,jb3;
	JLabel jl;
	Thread thread=null;
	int hour=0;
	int m=0;
	int s=0;
	Exam9(){
		jb1=new JButton("ø™ º");
		jb2=new JButton("‘›Õ£");
		jb3=new JButton("÷ÿ÷√");
		jl=new JLabel();
		this.setVisible(true);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jl);
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Exam9();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			if(thread==null){
				thread=new Thread(this);
				thread.start();
			}
		}else if(e.getSource().equals(jb2)){
			if(thread!=null){
				thread.stop();
				thread=null;
			}
			
		}else if(e.getSource().equals(jb3)){
			if(thread!=null){
				thread.stop();
				jl.setText("");
			}
		}
		
	}
	@Override
	public void run() {
		while(true){
			s++;
			if(s==60){
				s=0;
				m++;
				if(m==60){
					m=0;
					hour++;
				}
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jl.setText(hour+m+s+"");
		}
		
	}

}
