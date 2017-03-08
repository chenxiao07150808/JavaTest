package practiceDome;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JtableTest1 extends JFrame implements ActionListener {
	JLabel jl[];
	String str[]={"学号","姓名","年龄","班级"};
	JButton jb1,jb2;
	JTextField jt[];
	JRadioButton jr1,jr2;
	ButtonGroup bg;
	JPanel jp[];
	JtableTest1(){
		jl=new JLabel[4];
		for(int i=0;i<str.length;i++){
			jl[i]=new JLabel(str[i]);
		}
		jb1=new JButton("提交");
		jb2=new JButton("重置");
		jt=new JTextField[4];
		for(int i=0;i<4;i++){
			jt[i]=new JTextField(10);
		}
	jr1=new JRadioButton("男");
	jr2=new JRadioButton("女");
	bg=new ButtonGroup();
	jp=new JPanel[5];
	for(int i=0;i<5;i++){
		jp[i]=new JPanel();
	}
	}
	void init(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 250);
		this.setLayout(new FlowLayout());
		jp[4].setLayout(new GridLayout(2, 1));
		jp[0].add(jl[0]);
		jp[0].add(jt[0]);
		this.add(jp[0]);
		jp[1].add(jl[1]);
		jp[1].add(jt[1]);
		this.add(jp[1]);
		jp[2].add(jl[2]);
		jp[2].add(jt[2]);
		this.add(jp[2]);
		jp[3].add(jl[3]);
		jp[3].add(jt[3]);
		this.add(jp[3]);
		bg.add(jr1);
		bg.add(jr2);
		jp[4].add(jr1);
		jp[4].add(jr2);
		jp[4].add(jb1);
		jp[4].add(jb2);
		this.add(jp[4]);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	public static void main(String[] args) {
		JtableTest1 chen=new JtableTest1();
        chen.init();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			JOptionPane.showMessageDialog(null,"欢迎"+jt[0].getText()+jt[1].getText()+jt[2].getText()+jt[3].getText()+bg.getElements());
		}else if(e.getSource().equals(jb2)){
			jt[0].setText("");
			jt[1].setText(" ");
			jt[2].setText("");
			jt[3].setText("" );
		}
		
	}

}
