package practiceDome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SportDome3 extends JFrame implements ActionListener{
JButton jb;
SportDome3(){
	jb=new JButton("开始运行！");
}
void init(){
	this.setSize(300,520);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
	this.add(jb);
	jb.setBounds(0, 0, 100, 100);
	jb.addActionListener(this);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)){
			int x=(int)Math.random()*45+5;
			int y=(int)Math.random()*45+5;
			JLabel jl=new JLabel();
		}
		
	}

}
