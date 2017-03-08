package shixun;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

public class Exam6 extends JFrame implements ActionListener {
JButton jb;
JTable jtable;
DefaultTableModel dtm;
JScrollPane jsp;
String str[]={"id","aa"};
Exam6(){
	jb=new JButton("¿ªÊ¼");
	dtm=new DefaultTableModel(str,0);
	jtable=new JTable(dtm);
	jsp=new JScrollPane(jtable);
	this.setVisible(true);
	this.setSize(350, 350);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	this.add(jb,BorderLayout.NORTH);
  	this.add(jsp,BorderLayout.CENTER);
  	jb.addActionListener(this);
}
	public static void main(String[] args) {
	Exam6 a=new Exam6();
	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)){
			Connection conn=(Connection) Exam7.getComnection();
			try {
				Statement s=conn.createStatement();
				ResultSet rs=s.executeQuery("select*from stu");

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

}
