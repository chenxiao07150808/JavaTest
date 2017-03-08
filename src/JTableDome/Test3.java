package JTableDome;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.print.PrinterException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

public class Test3 extends JFrame {
     JLabel jl1,jl2,jl3,jl4;
      JTextArea jt1,jt2,jt3;
     JPanel jp1,jp2,jp3,jp4;
     JButton jb1,jb2,jb3,jb4;
     JTable table;
     JScrollPane jsp;
     String []str={"学号","姓名","年龄","班级"};
     String str1[]={"软件8班","物联网","室内设计","商务英语"};
     DefaultTableModel dtm;
     JComboBox jc;
	 Test3(){
		jl1=new JLabel("学号");
		jl2=new JLabel("姓名");
		jl3=new JLabel("年龄");
		jl4=new JLabel("班级");
	    jt1=new JTextArea(1,10);
	    jt2=new JTextArea(1,10);
	    jt3=new JTextArea(1,10);
	    jc=new JComboBox(str1);
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
	    jb1=new JButton("添加");
	    jb2=new JButton("删除");
	    jb3=new JButton("修改");
	    jb4=new JButton("清除");
	    dtm=new DefaultTableModel(str,0);
	    table=new JTable(dtm);
	    jsp=new JScrollPane(table);
		
   }
   void init(){
	   this.setSize(350, 350);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setLayout(new BorderLayout()); 
	   jp1.add(jl1);
	   jp1.add(jt1);
	   jp1.add(jl2);
	   jp1.add(jt2);
	   jp2.add(jl3);
	   jp2.add(jt3);
	   jp2.add(jl4);
	   jp2.add(jc);
	   jp3.add(jb1);
	   jp3.add(jb2);  
	   jp3.add(jb3); 
	   jp3.add(jb4);
	   jp4.add(jp1);
	   jp4.add(jp2);
	   jp4.add(jp3);
	   jp4.setLayout(new GridLayout(3,1));
	   this.add(jp4,BorderLayout.NORTH);
	   this.add(jsp,BorderLayout.CENTER);
	  
	   
   }
 
	   public static void main(String[] args) {
    new Test2().init();
     
	}	
	}