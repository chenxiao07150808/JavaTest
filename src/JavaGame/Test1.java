package JavaGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test1 extends JFrame implements ActionListener{
   JLabel jl1,jl2,jl3,jl4,jl5;
   JButton jb1,jb2,jb3;
   JTextField jt1,jt2;
   JPanel jp[];
   String str1[]={" ","����","ʯͷ","��"};
   JComboBox jc;
   Test1(){
	   super("С�����Ϸ����");
	   jl1=new JLabel("���");
	   jl2=new JLabel("��ǰ�÷�");
	   jl3=new JLabel();
	   jb1=new JButton("��ʼ");
	   jb2=new JButton("�˳�");
	   jb3=new JButton("��¼");
	   jt1=new JTextField(5);
	   jt2=new JTextField(5);
	   jc=new JComboBox(str1);
	   jl4=new JLabel(new ImageIcon("2.gif"));
	   jl5=new JLabel(new ImageIcon(""));
	   jp=new JPanel[7];
	   for(int i=0;i<jp.length;i++){
		   jp[i]=new JPanel();
	   }
	  
   }
   void init(){
	   this.setSize(300, 350);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setLayout(new BorderLayout());
	   jp[0].add(jl1);
	   jp[0].add(jt1);
	   jp[0].add(jl2);
	   jp[0].add(jt2);
	   jp[1].add(jb1);
	   jp[1].add(jb2);
	   jp[1].add(jb3);
	   jp[1].add(jc);
	   jp[2].add(jp[0]);
	   jp[2].add(jp[1]);
	   jp[2].setLayout(new GridLayout(3,1));
	   jp[3].add(jl4);
	   jp[3].add(jl5);
	   jp[4].add(jl3);
	   jp[5].add(jp[3]);
	   jp[5].add(jp[4]);
	   this.add(jp[5],BorderLayout.CENTER);
	   this.add(jp[2],BorderLayout.NORTH);
	   jb3.addActionListener(this);
	   jb1.addActionListener(this);
	   jb2.addActionListener(this);
	  
   }
	public static void main(String[] args) {
		new Test1().init();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int count = (int) (Math.random() * 3);
		if(e.getSource().equals(jb3)){
			jt2.setText("100");
			jl3.setText("��ӭ���"+jt1.getText()+"  "+"ÿ��ʮ����"+" "+"���ȭ�ѣ�");
		}else if(e.getSource().equals(jb1)){
			if(count==1){
				jl4.setIcon(new ImageIcon("5.jpg"));
				
			}else if(count==2){
				jl4.setIcon(new ImageIcon("6.jpg"));
			}else if(count==3){
				jl4.setIcon(new ImageIcon("7.jpg"));
			}
			
		}else if(e.getSource().equals(jb2)){
			JOptionPane.showMessageDialog(null, "������÷�Ϊ"+jt2.getText());
			jt1.setText(" ");
			jt2.setText(" ");
			jl3.setText("С������İ���");
		}
	if(count==1&&jc.getSelectedIndex()==1){
		jl5.setIcon(new ImageIcon("7.jpg"));
//		jt2.setText("110");
	Double i=Double.parseDouble(jt2.getText());
	  i+=10;
	  jt2.setText(i+"");
		jl3.setText("��ϲ��ң���Ӯ�ˣ�Ӯ��10������");
	}else if(count==1&&jc.getSelectedIndex()==2){
		jl5.setIcon(new ImageIcon("6.jpg"));
//		jt2.setText("90");
		Double i=Double.parseDouble(jt2.getText());
		  i-=10;
		  jt2.setText(i+"");
		jl3.setText("С��Ӯ�ˣ������ˣ��۳�10������");
	}else if(count==1&&jc.getSelectedIndex()==3){
		jl5.setIcon(new ImageIcon("5.jpg"));
//		jt2.setText("100");
		Double i=Double.parseDouble(jt2.getText());
		  jt2.setText(i+"");
		jl3.setText("��ƽ��");
	}
	else if(count==2&&jc.getSelectedIndex()==1){
		jl5.setIcon(new ImageIcon("7.jpg"));
//		jt2.setText("90");
		Double i=Double.parseDouble(jt2.getText());
		  i-=10;
		  jt2.setText(i+"");
		  jl3.setText("С��Ӯ�ˣ������ˣ��۳�10������");
	}else if(count==2&&jc.getSelectedIndex()==2){
		jl5.setIcon(new ImageIcon("6.jpg"));
//		jt2.setText("100");
		Double i=Double.parseDouble(jt2.getText());
		  jt2.setText(i+"");
		  jl3.setText("��ƽ��");
	}else if(count==2&&jc.getSelectedIndex()==3){
		jl5.setIcon(new ImageIcon("5.jpg"));
//		jt2.setText("110");
		Double i=Double.parseDouble(jt2.getText());
		  i+=10;
		  jt2.setText(i+"");
		  jl3.setText("��ϲ��ң���Ӯ�ˣ�Ӯ��10������");
	}else if(count==3&&jc.getSelectedIndex()==1){
		jl5.setIcon(new ImageIcon("7.jpg"));
//		jt2.setText("110");
		Double i=Double.parseDouble(jt2.getText());
		  i+=10;
		  jt2.setText(i+"");
		  jl3.setText("��ϲ��ң���Ӯ�ˣ�Ӯ��10������");
		  jl3.setForeground(Color.red);
	}else if(count==3&&jc.getSelectedIndex()==2){
		jl5.setIcon(new ImageIcon("6.jpg"));
//		jt2.setText("90");
		Double i=Double.parseDouble(jt2.getText());
		  i-=10;
		  jt2.setText(i+"");
		  jl3.setText("С��Ӯ�ˣ������ˣ��۳�10������");
	}else if(count==3&&jc.getSelectedIndex()==3){
		jl5.setIcon(new ImageIcon("5.jpg"));
//		jt2.setText("100");
		Double i=Double.parseDouble(jt2.getText());
		  jt2.setText(i+"");
		  jl3.setText("��ƽ��");
	}
	}
	

}
