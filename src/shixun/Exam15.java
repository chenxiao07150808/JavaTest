package shixun;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.*;
public class Exam15 extends JFrame implements ActionListener {
	JButton jb,jb2;
	String str[]={"Ñ§ºÅ","ÐÕÃû","ÄêÁä","°à¼¶"};
	JTable table;
	DefaultTableModel dtm;
	JScrollPane jsp;
	JPanel jp;
	Exam15(){
		jp=new JPanel();
		jb=new JButton("ÏÔÊ¾");
		jb2=new JButton("Òþ²Ø");
		dtm=new DefaultTableModel(str,0);
		table=new JTable(dtm);
		jsp=new JScrollPane(table);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,350);
		jp.add(jb,FlowLayout.LEFT);
  	jp.add(jb2);
		this.add(jp,BorderLayout.NORTH);
		this.add(jsp,BorderLayout.CENTER);
		jb.addActionListener(this);
		jb2.addActionListener(this);
	}
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	public static void main(String[] args) {
		Exam15 test=new Exam15();

	}


	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(jb)){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?characterEncoding=gbk", "root",
					"");
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from stu");
			while (rs.next()) {
				String str[] = { rs.getString("num"), rs.getString("name"), rs.getInt("age") + " ",
						rs.getString("classname") };
				dtm.addRow(str);

			}

		} catch (SQLException f) {

		} catch (ClassNotFoundException d) {
			System.out.println("Çý¶¯Ê§°Ü");
		}
	}

	}
		
	}


