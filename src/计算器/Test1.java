package 计算器;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Test1 extends JFrame  {
	JButton jb[];
 JButton D;
 JButton T;
	String[] str = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/" };
	JPanel jp1, jp2, jp3, jp4, jp5 ;
	JTextArea input, show;
    JLabel jl1;
	Test1() {
		super("小丑");
		jb = new JButton[16];
		for (int i =0; i < jb.length; i++) {
			jb[i] = new JButton(str[i]);
		}
		D=new JButton("重置");
		T=new JButton("撤销");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp5=new JPanel();
		input = new JTextArea(2, 21);
		show = new JTextArea("Result:\n", 2, 21);
       jl1=new JLabel("     注意:只支持一级运算");
	}
	 private double result=0;
	void init() {
//	jb[0].setBounds(150, 104, 100, 22);
		this.setSize(250, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(8, 1));
		this.add(input);
		this.add(show);
		jp1.add(jb[0]);
		jp1.add(jb[1]);
		jp1.add(jb[2]);
		jp1.add(jb[3]);
		this.add(jp1);
		jp2.add(jb[4]);
		jp2.add(jb[5]);
		jp2.add(jb[6]);
		jp2.add(jb[7]);
		this.add(jp2);
		jp3.add(jb[8]);
		jp3.add(jb[9]);
		jp3.add(jb[10]);
		jp3.add(jb[11]);
		this.add(jp3);
		jp4.add(jb[12]);
		jp4.add(jb[13]);
		jp4.add(jb[14]);
		jp4.add(jb[15]);
		this.add(jp4);
		jp5.add(D);
		jp5.add(T);
		this.add(jp5);
		this.add(jl1);
		jl1.setForeground(Color.red);
		jb[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"1");
            }
        });
		jb[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"2");
            }
        });
		jb[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"3");
            }
        });
		jb[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"+");
            }
        });
		jb[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"4");
            }
        });
		jb[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"5");
            }
        });
		jb[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"6");
            }
        });
		jb[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"-");
            }
        });
		jb[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"7");
            }
        });
		jb[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"8");
            }
        });
		jb[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"9");
            }
        });jb[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"*");
            }
        });
        jb[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"0");
            }
        });
        jb[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+".");
            }
        });
        jb[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"/");
            }
        });
       
        jb[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String []str3;
                 String []str4;
                 String []str5;
                 String []str6;
                String in=input.getText();
                str3 = in.split("\\+");
                str4 = in.split("-");
                str5 = in.split("\\*");
                str6 = in.split("/");
            	
                if(str3.length>1){
                for(int l=0;l<str3.length;l++){
                	result+=Double.parseDouble(str3[l]);
                }
                show.setText(result+"");
                result=0;
                }
                if(str4.length>1){
                	double result1=Double.parseDouble(str4[0]);
                    for(int l=1;l<str4.length;l++){
                    	result1-=Double.parseDouble(str4[l]);
                    }
                    show.setText(result1+"");
                    result1=0;
                    }
                if(str5.length>1){
                	double result2=Double.parseDouble(str5[0]);
                    for(int l=1;l<str5.length;l++){
                    	result2*=Double.parseDouble(str5[l]);
                    }
                    show.setText(result2+"");
                    result2=0;
                    }
                if(str6.length>1){
                	double result3=Double.parseDouble(str6[0]);
                    for(int l=1;l<str6.length;l++){
                    	result3/=Double.parseDouble(str6[l]);
                    }
                    show.setText(result3+"");
                    result3=0;
                    }
              
	     }
            
        });
        D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                input.setText(" ");
                show.setText("Result:\n");
               
            }
        });
       T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	
            	 if (input.getText().length()>0){
            		input.setText(input.getText().substring(0,input.getText().length()-1));
            	 }
               
            }
        });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1().init();
//		new Test1().setVisible(true);
	
	}
	
}
