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

public class Exam13 extends JFrame implements ActionListener{
	JButton jb1,jb2;
	JTable table;
	DefaultTableModel dtm;
	JScrollPane jsp;
	String str[]={"学号","姓名","身高","年龄"};
	Exam13 (){
		jb1=new JButton("显示");
		jb2=new JButton("隐藏");
		dtm=new DefaultTableModel(str,0);
		table=new JTable(dtm);
		jsp=new JScrollPane(table);
		JPanel jp=new JPanel();
		jp.add(jb1,FlowLayout.LEFT);
		jp.add(jb2);
		this.add(jp,BorderLayout.NORTH);
		this.add(jsp,BorderLayout.CENTER);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,350);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	public static void main(String[] args) {
		Exam13 test=new Exam13();

	}

	public void actionPerformed(ActionEvent e) {
		java.sql.Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/class1508?characterEncoding=gbk", "root",
					"");
		} catch (ClassNotFoundException e1) {
System.out.println("驱动失败");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(e.getSource().equals(jb1)){
			if(conn!=null){
				Statement sm;
				try {
					sm = conn.createStatement();
					ResultSet rs=sm.executeQuery("select * from student1");
					while(rs.next()){
						String str2[]={
							rs.getString("ID"),rs.getString("name"),rs.getString("height"),
							rs.getString("age")
						};
						dtm.addRow(str2);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}else if(e.getSource().equals(jb2)){
			if(conn!=null){
			int count=table.getRowCount();
			for(int i=0;i<count;i++){
				if(count==0){
			break;
				}
				dtm.removeRow(i);
			}
			}
		}
	}

}
