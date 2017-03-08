package JListDome;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

import javax.swing.*;
import javax.swing.*;

public class Test2 extends JFrame implements ActionListener{
	JPanel jp[];
	JLabel jl[];
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	JTextField jt1,jt2,jt3;
	ButtonGroup bg;
	String str[]={
			"操作数1",
			"操作数2",
			"计算结果"
	};
	
	Test2(){
		super("小丑计算器");
		jp=new JPanel[4];
		for(int i=0;i<jp.length;i++){
			jp[i]=new JPanel();
		}
		jl=new JLabel[3];
		for(int a=0;a<jl.length;a++){
			jl[a]=new JLabel(str[a]);
		}
		 jrb1=new JRadioButton("+");
		 jrb2=new JRadioButton("-");
		 jrb3=new JRadioButton("*");
		 jrb4=new JRadioButton("/");
		 jt1=new JTextField(10);
		 jt2=new JTextField(10);
		 jt3=new JTextField(10);
		 bg=new ButtonGroup();
		 
	}
     void init(){
    	 this.setLayout(new GridLayout(4, 1));
        jp[0].setLayout(new FlowLayout(FlowLayout.LEFT));
        jp[1].setLayout(new FlowLayout(FlowLayout.LEFT));
        jp[2].setLayout(new FlowLayout(FlowLayout.LEFT));
        jp[3].setLayout(new FlowLayout(FlowLayout.LEFT));
   	  this.setSize(350, 350);
   	  this.setVisible(true);
   	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	  jp[0].add(jl[0]);
   	  jp[0].add(jt1);
   	  this.add(jp[0]);
   	  jp[1].add(jl[1]);
   	  jp[1].add(jt2);
   	  this.add(jp[1]);
   	  jp[2].add(jrb1);
      jp[2].add(jrb2);
   	  jp[2].add(jrb3);
   	  jp[2].add(jrb4);
   	  bg.add(jrb1);
   	  bg.add(jrb2);
   	  bg.add(jrb3);
   	  bg.add(jrb4);
   	 this.add(jp[2]);
   	 jp[3].add(jl[2]);
   	 jp[3].add(jt3);
   	 this.add(jp[3]);
	jt3.setEditable(false);
	 jrb1.addActionListener(this);
	  jrb2.addActionListener(this);
	  jrb3.addActionListener(this);
	  jrb4.addActionListener(this);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Test2().init();
	}
	public void actionPerformed(ActionEvent e) {
		double x1=0,x2=0;
		try {
			x1=Double.parseDouble(jt1.getText());
			x2=Double.parseDouble(jt2.getText());
			
		} catch (NumberFormatException a) {
			JOptionPane.showMessageDialog(null, "你输入非数字！，小丑我不会算啊！晓主人");
			}
		if(e.getSource().equals(jrb1)){
			jt3.setText((x1+x2+""));
		}else if(e.getSource().equals(jrb2)){
			jt3.setText((x1-x2+""));
		}else if(e.getSource().equals(jrb3)){
			
			jt3.setText((x1*x2+""));
		}else if(e.getSource().equals(jrb4)){
			if(x2==0){
				JOptionPane.showMessageDialog(null, "分母不为零");
			}else{
			jt3.setText((x1/x2+""));
			}
		}
		
	}

}
