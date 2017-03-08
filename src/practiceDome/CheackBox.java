package practiceDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheackBox extends JFrame implements ActionListener {
	JButton jb;
	JLabel jl ,jl2;
	JCheckBox jc1,jc2,jc3,jc4;
	JPanel jp1,jp2;
CheackBox (){
	jb=new JButton("确定");
	jl =new JLabel("java 运行的三个版本：");
	jl2=new JLabel("");
	jc1=new JCheckBox("javaEE");
	jc2=new JCheckBox("javaME");
	jc3=new JCheckBox("javaSE");
	jc4=new JCheckBox("JDK");
	jp1=new JPanel();
	jp2=new JPanel();
}
void init(){
	this.setSize(250,250);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	jp1.add(jl);
	jp1.add(jc1);
	jp1.add(jc2);
	jp1.add(jc3);
	jp1.add(jc4);
	this.add(jp1);
	jp2.add(jb);
	jp2.add(jl2);
	this.add(jp2);
	jb.addActionListener(this);
}
	public static void main(String[] args) {
	new	CheackBox().init(); 

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)){
			if(jc1.isSelected()&&jc2.isSelected()&&jc3.isSelected()&&!jc4.isSelected()){
				jl2.setText("正确");
			}else{
				jl2.setText("错误");
			}
		}
		
	}

}
