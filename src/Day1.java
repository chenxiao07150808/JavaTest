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
		super("�ҵĴ���");
		jb1=new JButton("�ύ");
		jl1=new JLabel("����");
		jl2=new JLabel("�Ա�");
		jl3=new JLabel("����");
		jl4=new JLabel("�ǳ�");
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jt3=new JTextField(10);
		jc1=new JCheckBox("��");
		jc2=new JCheckBox("Ů");
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
			JOptionPane.showMessageDialog(Day1.this , "��ӭ�û�"+jt3.getText()+ "��˶��� ����Ϣ "+" "+"����:"+jt1.getText()+" "+"����"+jt2.getText()+" "+"�Ա�");
				
			}
		});
	}
	public static void main(String[] args) {
		new Day1().init();
	}

}
