package practiceDome;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class JTableDome extends JFrame{
	JLabel jl1,jl2,jl3,jl4;
	JButton jb1,jb2;
	JTextField jt1,jt2,jt3,jt4;
	JComboBox jc;
	String str[]={"�������","����Ӣ��","Ӧ��Ӣ��","������"};
	JComboBox jcb;
    JRadioButton jr1,jr2;
    ButtonGroup bg;
    JPanel jp1,jp2,jp3,jp4;
    JTableDome(){
    super("ѧ���ǼǱ�");
     jl1=new JLabel("����");
     jl2=new JLabel("ѧ��");
     jl3=new JLabel("����");
     jl4=new JLabel("�Ա�");
     jb1=new JButton("�ύ");
     jb2=new JButton("����");
     jt1=new JTextField(10);
     jt2=new JTextField(10);
     jt3=new JTextField(10);
     jt4=new JTextField(10);
     jcb=new JComboBox(str);
     jr1=new JRadioButton("��");
     jr2=new JRadioButton("Ů");
     jp1=new JPanel();
     jp2=new JPanel();
     jp3=new JPanel();
     jp4=new JPanel();
     bg=new ButtonGroup();
    }
    public void init(){
    this.setVisible(true);
    this.setSize(450, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    jp1.add(jl1);
    jp1.add(jt1);
    jp1.add(jl2);
    jp1.add(jt2);
    jp2.add(jl3);
    jp2.add(jt3);
    jp3.add(jl4);
    bg.add(jr1);
    bg.add(jr2);
    jp3.add(jr1);
    jp3.add(jr2);
    jp4.add(jp1);
    jp4.add(jp2);
    jp4.add(jp3);
 
    this.add(jp4);
    }
	public static void main(String[] args) {
		JTableDome jtable=new JTableDome();
		jtable.init();

	}

}
