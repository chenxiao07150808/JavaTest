package practiceDome;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class JTableDome3 extends JFrame {
JPanel jp;
JLabel jl1,jl2,jl3,jl4,jl5;
JTextField jt1,jt2;
JRadioButton jr1,jr2;
JCheckBox jc1,jc2;
JList jlist;
JButton jb,jb2;
JScrollPane jsp;
 JTableDome3() {
	jp=new JPanel();
	jl1=new JLabel("����");
	jl2=new JLabel("����");
	jl3=new JLabel("�Ա�");
	jl4=new JLabel("�ó�");
	jl5=new JLabel("���ҽ���");
	jt1=new JTextField(10);
	jt2=new JTextField(10);
	jr1=new JRadioButton("��");
	jr2=new JRadioButton("Ů");
	jc1=new JCheckBox("java");
	jc2=new JCheckBox("C");
	jlist=new JList();
	jsp =new JScrollPane();
	jb=new JButton("ȷ��");
	jb2=new JButton("����");
}
 void init(){
this.setSize(250,250);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
this.add(jl1);
this.add(jt1);
this.add(jl2);
this.add(jt2);
this.add(jl3);
this.add(jr1);
this.add(jr2);
this.add(jl4);
this.add(jc1);
this.add(jc2);
jsp.setViewportView(jlist);
jlist.setVisibleRowCount(2);
jsp.add(jlist);
jp.add(jl5);
jp.add(jsp);
this.add(jp);
this.add(jb);
this.add(jb2);
 }
	public static void main(String[] args) {
new JTableDome3().init();
	}

}
