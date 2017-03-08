
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class anniu extends JFrame implements ActionListener {
	JLabel jl[];
	String str[] = { "操作数1", "操作数2", "计算结果是" };
	JTextField jtf1, jtf2, jtf3;
	JPanel jp1, jp2, jp3, jp4;
	JRadioButton jrb1, jrb2, jrb3, jrb4;//圆形选择框
	ButtonGroup bg;//选择框组

	anniu() {
		super("计算器");
		jl = new JLabel[3];
		for (int i = 0; i < jl.length; i++) {
			jl[i] = new JLabel(str[i]);
		}

		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();

		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("*");
		jrb4 = new JRadioButton("/");

		bg = new ButtonGroup();//建立选择组，实现单选

	}

	void init() {
		jp1.add(jl[0]);
		jp1.add(jtf1);
		this.add(jp1);

		jp2.add(jl[1]);
		jp2.add(jtf2);
		this.add(jp2);

		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		jp3.add(jrb4);
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		this.add(jp3);

		jp4.add(jl[2]);
		jp4.add(jtf3);
		this.add(jp4);

		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);

		jtf1.addActionListener(this);
		jtf2.addActionListener(this);

		this.setLayout(new GridLayout(4, 1));
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp4.setLayout(new FlowLayout(FlowLayout.LEFT));

		this.setVisible(true);
		this.setSize(400, 400);
		this.setLocation(600, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {

		anniu an = new anniu();
		an.init();
	}

	public void actionPerformed(ActionEvent e) {
		class MyMath{
			public double caculate(double x) throws MyException{
				
				if (e.getSource().equals(jrb1) || e.getSource().equals(jrb2)
						|| e.getSource().equals(jrb3) || e.getSource().equals(jrb4)) {
					if (jtf1.getText().equals("[^(0-9)]")){
						JOptionPane.showMessageDialog(null, "你输入非数字！，小丑我不会算啊！晓主人");
						throw new MyException();
					}else{
					}
				}
				return x;
			}
		}
		double n1 = 0;
		double n2 = 0;
		   MyMath mymath=new MyMath();
		try {
			n1 = Double.parseDouble(jtf1.getText());
			n2 = Double.parseDouble(jtf2.getText());
			System.out.println(mymath.caculate(n1));
			System.out.println(mymath.caculate(n2));

		} catch (MyException a) {
			JOptionPane.showMessageDialog(null, "你输入非数字！，小丑我不会算啊！晓主人");
		}
		if (jrb1.isSelected()) {
			jtf3.setText((n1 + n2 + ""));
		} else if (jrb2.isSelected()) {
			jtf3.setText((n1 - n2 + ""));
		} else if (jrb3.isSelected()) {
			jtf3.setText((n1 * n2 + ""));
		} else if (jrb4.isSelected()) {
			jtf3.setText((n1 / n2 + ""));

		}

	}

}
