package connectionDome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

public class Test3 extends JFrame implements ActionListener,ListSelectionListener {
	JLabel jl1, jl2, jl3, jl4;
	JTextField jt[];
	JPanel jp1, jp3, jp4;
	JButton jb[];
	JTable table;
	JScrollPane jsp;
	String[] str = { "学号", "姓名", "年龄", "班级" };
	String str1[] = {"软件8班", "物联网", "室内设计", "商务英语" };
	String str2[] = { " 添   加 ", " 删   除 ", " 修   改 ", " 刷   新 ", " 查   询 " };
	DefaultTableModel dtm;
	JComboBox jc;
	student stu;
	Test3() {
		jl1 = new JLabel("学号");
		jl2 = new JLabel("姓名");
		jl3 = new JLabel("年龄");
		jl4 = new JLabel("班级");
		jt = new JTextField[10];
		for (int x = 0; x < jt.length; x++) {
			jt[x] = new JTextField(10);
		}
		jc = new JComboBox(str1);
		jp1 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jb = new JButton[5];
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(str2[i]);
		}
		dtm = new DefaultTableModel(str, 0);
		table = new JTable(dtm);
		jsp = new JScrollPane(table);
		table.setGridColor(Color.red);
		table.setBackground(Color.lightGray);
		table.setSelectionBackground(Color.WHITE);
	}

	void init() {
		this.setSize(650, 450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		jp1.add(jl1);
		jp1.add(jt[0]);
		jp1.add(jl2);
		jp1.add(jt[1]);
		jp1.add(jl3);
		jp1.add(jt[2]);
		jp1.add(jl4);
		jp1.add(jc);
		jp3.add(jb[0]);
		jp3.add(jb[1]);
		jp3.add(jb[2]);
		jp3.add(jb[3]);
		jp3.add(jb[4]);
		jp4.add(jp1);
		jp4.add(jp3);
		jp4.setLayout(new GridLayout(2, 1));
		this.add(jp4, BorderLayout.NORTH);
		this.add(jsp, BorderLayout.CENTER);
		jb[0].addActionListener(this);
		jb[1].addActionListener(this);
		jb[2].addActionListener(this);
     	jb[3].addActionListener(this);
	    jb[4].addActionListener(this);
		inittable();
		table.getSelectionModel().addListSelectionListener(this);
	}
	test1 query = new test1();
  public List inittable(){
	  List list=query.queryStudent();
	  for(int i=0;i<list.size();i++){
		  student stu=(student)list.get(i);
		  String str[]={stu.getNum(),stu.getName(),stu.getAge()+"",stu.getClassname()};
		  dtm.addRow(str);
	  }
	return list;
  }
	public static void main(String[] args) {
		new Test3().init();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
		if(e.getSource().equals(jb[0])){//添加
		String num=jt[0].getText();
		String name=jt[1].getText();
		int age=Integer.parseInt(jt[2].getText());
		String classname=jc.getSelectedItem().toString();
		student stu=new student(num, name, age, classname);
		query.insert(stu);
		String str[]={stu.getNum(),stu.getName(),stu.getAge()+"",stu.getClassname()};
		dtm.addRow(str);
		} else if (e.getSource().equals(jb[1])) {//删除
			int index =table.getSelectedRow();
     		String num=dtm.getValueAt(index, 0).toString();
		    query.delete(num);
		    if(index>=0)
		    dtm.removeRow(index);
		} else if (e.getSource().equals(jb[2])) {//修改
			int row=table.getSelectedRow();
			String num2=dtm.getValueAt(row, 0).toString();
			String num1=jt[0].getText();
			String name1=jt[1].getText();
			int age1=Integer.parseInt(jt[2].getText());
			String classname1=jc.getSelectedItem().toString();
			student stu=new student(num1, name1, age1, classname1);
			query.qiu(num2,stu);
			String str[]={stu.getNum(),stu.getName(),stu.getAge()+"",stu.getClassname()};
			dtm.setValueAt(str[0], row, 0);
			dtm.setValueAt(str[1], row, 1);
			dtm.setValueAt(str[2], row, 2);
			dtm.setValueAt(str[3], row, 3);
		} else if (e.getSource().equals(jb[3])) {//刷新
			int count = table.getRowCount();
			for (int i = count-1; i >= 0; i--) {
				dtm.removeRow(i);
			} 
			 inittable();
//			 List list=query.queryStudent();
//			  for(int i=0;i<list.size();i++){
//				  student stu=(student)list.get(i);
//				  String str1[]={stu.getNum(),stu.getName(),stu.getAge()+"",stu.getClassname()};
//				  dtm.addRow(str1);
//			  }
		}else if(e.getSource().equals(jb[4])){
			int count = table.getRowCount();
			for (int i = count-1; i >= 0; i--) {
				dtm.removeRow(i);
			} 
		     String str=jc.getSelectedItem().toString();
			  List list=query.cha(str);
			  for(int i=0;i<list.size();i++){
				  student stu=(student)list.get(i);
				  String str1[]={stu.getNum(),stu.getName(),stu.getAge()+"",stu.getClassname()};
				  dtm.addRow(str1);
			  }
		  }
		}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource().equals(table.getSelectionModel())){
	    int row=table.getSelectedRow();
	    if(row>=0){
        dtm.getValueAt(row, 1);
	    jt[0].setText(dtm.getValueAt(row, 0).toString());
		jt[1].setText(dtm.getValueAt(row, 1).toString());
		jt[2].setText(dtm.getValueAt(row, 2).toString());
		jc.setSelectedItem( dtm.getValueAt(row, 3).toString());
	    }
		}
	}
}
