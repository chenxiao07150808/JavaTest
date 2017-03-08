package shixun;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Win extends JFrame implements ItemListener {
	JComboBox jc;
	String str[] = { "07140760", "07140761", "07140762", "07140763", "07140764" };
	String str2[] = { "小张", "小李", "小花", "小明", "小王" };
	String str3[] = { "60", "80", "70", "90", "78" };
	JLabel jl1, jl2;
	JTextField jt1, jt2;
	JPanel jp;

	public Win() {
		jc = new JComboBox(str);
		jl1 = new JLabel("姓名");
		jl2 = new JLabel("成绩");
		jt1 = new JTextField(10);
		jt2 = new JTextField(10);
		jp = new JPanel();
		init();
	}

	void init() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(450, 300);
		this.setLayout(new FlowLayout());
		jp.add(jc);
		jp.add(jl1);
		jp.add(jt1);
		jp.add(jl2);
		jp.add(jt2);
		this.add(jp);
		jc.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource().equals(jc)) {
			if (jc.getSelectedIndex() == 0) {
				jt1.setText(str2[0]);
				jt2.setText(str3[0]);
			} else if (jc.getSelectedIndex() == 1) {
				jt1.setText(str2[1]);
				jt2.setText(str3[1]);
			} else if (jc.getSelectedIndex() == 2) {
				jt1.setText(str2[2]);
				jt2.setText(str3[2]);
			} else if (jc.getSelectedIndex() == 3) {
				jt1.setText(str2[3]);
				jt2.setText(str3[3]);
			} else if (jc.getSelectedIndex() == 4) {
				jt1.setText(str2[4]);
				jt2.setText(str3[4]);
			}

		}
	}
}

public class Exam1 {
	public static void main(String[] args) {
		new Win();
	}
}
