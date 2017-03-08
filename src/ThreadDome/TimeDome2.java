package ThreadDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimeDome2 extends JFrame implements Runnable,ActionListener{
    JLabel jl1;
    JButton jb1,jb2,jb3;
    JPanel jp;
    Thread thread=null;
    TimeDome2(){
    	jl1=new JLabel();
    	jb1=new JButton("ø™ º");
    	jb2=new JButton("‘›Õ£");
    	jb3=new JButton("÷ÿ÷√");
    	jp=new JPanel();
    	this.setVisible(true);
    	this.setSize(350, 350);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLayout(new FlowLayout());
    	jp.add(jl1);
    	jp.add(jb1);
    	jp.add(jb2);
    	jp.add(jb3);
    	this.add(jp);
    	jb1.addActionListener(this);
    	jb2.addActionListener(this);;
    	jb3.addActionListener(this);
    }
	public static void main(String[] args) {
	new TimeDome2();

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
			}
		}
		
	}
	@Override
	public void run() {
		while(true){
			Date date=new Date();
			jl1.setText(date.toLocaleString());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
