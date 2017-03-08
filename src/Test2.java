import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;


import javax.swing.*;
public class Test2 extends JFrame implements ActionListener{
	JLabel jl1,jl2;
	JButton jb;
	JPanel jp1,jp2;
	JCheckBox jc1,jc2,jc3,jc4;
	Test2(){
		super("复选框例子");
		jl1 = new JLabel("Java运行的三个版本是:");
		jl2 = new JLabel(" ");
		jb=new JButton("确定");
		jp1=new JPanel();
		jp2=new JPanel();
		jc1=new JCheckBox("javaEE");
		jc2=new JCheckBox("javaME");
		jc3=new JCheckBox("javaSE");
		jc4=new JCheckBox("JDK");
		
	}
	void init(){
		jp1.add(jl1);
		jp1.add(jc1);
		jp1.add(jc2);
		jp1.add(jc3);
		jp1.add(jc4);
		jp2.add(jb);
		jp2.add(jl2);
		this.add(jp1);
		this.add(jp2);
		this.setSize(500,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setLayout(new GridLayout(2,1));
 jb.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Test2().init();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(jc1.isSelected()&&jc2.isSelected()&&jc3.isSelected()&&!jc4.isSelected()){
		jl2.setText("正确");
		jl2.setForeground(Color.RED);
		
	}else{
		jl2.setText("错误");
		jl2.setForeground(Color.BLUE);
	}
	}
}
