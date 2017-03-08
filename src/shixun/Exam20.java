package shixun;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam20 extends JFrame implements ActionListener{
  JLabel jl,jl2,jl3;
  JTextField jt1;
  JButton jb1,jb2;
Exam20(){
	jl=new JLabel("Happy聊天室Copyright2007-2010");
	jl2=new JLabel("请输入你的名字");
	jl3=new JLabel(new ImageIcon("5.jpg"));
	jb1=new JButton("系统消息");
	jb2=new JButton("退出");
	jt1=new JTextField(50);
	this.setVisible(true);
	this.setSize(250,250);
	this.setLayout(new FlowLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.add(jl);
	this.add(jl3);
	this.add(jb1);
	this.add(jl2);
	this.add(jt1);
	this.add(jb2);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Exam20 test=new Exam20();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
