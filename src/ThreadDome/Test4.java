package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.crypto.Data;

public class Test4 extends JFrame implements ActionListener,Runnable {
	JLabel jl;
	JButton jb1,jb2,jb3;
	Thread thread;
	Boolean flag = true;
 Test4(){
	 jl=new JLabel();
	 jb1=new JButton("ø™ º");
	 jb2=new JButton("‘›Õ£");
	 jb3=new JButton("÷ÿ÷√");
	 
	 JPanel jp=new JPanel();
	 
	 jp.add(jl);
	 jp.add(jb1);
	 jp.add(jb2);
	 jp.add(jb3);
	 
	 
	 this.add(jp);
	 this.setSize(350,350);
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLayout(new FlowLayout());
	  
	 jb1.addActionListener(this);
	 jb2.addActionListener(this);
	 jb3.addActionListener(this);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Test4();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if (flag) {
			Date date=new Date();
			jl.setText(date.toGMTString());
			}
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException a) {
				// TODO Auto-generated catch block
				a.printStackTrace();
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb1)){
			if (thread == null) {
			thread=new Thread(this);
			thread.start();
			}
		}else if(e.getSource().equals(jb2)){
			flag=!flag;
		}
	}

}
