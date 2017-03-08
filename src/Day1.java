import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Day1 extends JFrame {
	JButton jb1;
	JLabel jl1,jl2,jl3,jl4;
	JTextField jt1,jt2,jt3;
	JCheckBox jc1,jc2;
	JPanel jp1,jp2,jp3,jp4,jp5;
	Day1 (){
		super("我的窗口");
		jb1=new JButton("提交");
		jl1=new JLabel("姓名");
		jl2=new JLabel("性别");
		jl3=new JLabel("年龄");
		jl4=new JLabel("昵称");
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jt3=new JTextField(10);
		jc1=new JCheckBox("男");
		jc2=new JCheckBox("女");
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jp5=new JPanel();
		
	}
	void init(){
		jp1.add(jl1);
		jp1.add(jt1);
		jp2.add(jl2);
		jp2.add(jt2);
		jp3.add(jl3);
		jp3.add(jc1);
		jp3.add(jc2);
		jp4.add(jl4);
		jp4.add(jt3);
		jp5.add(jb1);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.setSize(250, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(Day1.this , "欢迎用户"+jt3.getText()+ "请核对你 的信息 "+" "+"姓名:"+jt1.getText()+" "+"年龄"+jt2.getText()+" "+"性别");
				
			}
		});
	}
	public static void main(String[] args) {
		new Day1().init();
	}

}
