package practiceDome;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JTable2 extends JFrame implements ActionListener {
    JRadioButton jr1,jr2,jr3,jr4;
    JLabel jl1,jl2,jl3;
    JTextField jt1,jt2,jt3;
    ButtonGroup bg;
    JPanel jp1,jp2,jp3,jp4;
	JTable2(){
		jr1=new JRadioButton("+");
		jr2=new JRadioButton("-");
		jr3=new JRadioButton("*");
		jr4=new JRadioButton("/");
		jl1=new JLabel("操作数1");
		jl2=new JLabel("操作数2");
		jl3=new JLabel("结果");

		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jt3=new JTextField(10);
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		bg=new ButtonGroup();
	}
	void init(){
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 1));
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);
		jp1.add(jl1);
		jp1.add(jt1);
		this.add(jp1);
		jp2.add(jl2);
		jp2.add(jt2);
		this.add(jp2);
		jp3.add(jr1);
		jp3.add(jr2);
		jp3.add(jr3);
		jp3.add(jr4);
		this.add(jp3);
		jp4.add(jl3);
		jp4.add(jt3);
		this.add(jp4);
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		jr3.addActionListener(this);
		jr4.addActionListener(this);
	}
	public static void main(String[] args) {
	new	JTable2().init();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
	 double a=0;
	 double b=0;
	    try {
			a=Double.parseDouble(jt1.getText());
			b=Double.parseDouble(jt2.getText());
		} catch (NumberFormatException e2) {
			
		}
		if(e.getSource().equals(jr1)){
		jt3.setText(a+b+" ");
	}else if(e.getSource().equals(jr2)){
		jt3.setText(a-b+" ");
	}else if(e.getSource().equals(jr3)){
		jt3.setText(a*b+" ");
		
	}else if(e.getSource().equals(jr4)){
		jt3.setText(a/b+" ");
	}
		
	}

}
