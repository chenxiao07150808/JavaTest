package shixun;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

public class Exam14 extends JFrame implements ActionListener{
	JButton jb1,jb2,jb3,jb4;
	JLabel jl1,jl2,jl3,jl4;
	JTextField jt1,jt2,jt3,jt4;
	DefaultTableModel dtm;
	JScrollPane jsp;
	JTable table;
	String str[]={"学号","姓名","身高","年龄"};
	Exam14(){
		jb1=new JButton("显示");
		jb2=new JButton("添加");
		jb3=new JButton("删除");
		jb4=new JButton("隐藏");
		jl1=new JLabel("学号");
		jl2=new JLabel("姓名");
		jl3=new JLabel("身高");
		jl4=new JLabel("年龄");
		 jt1=new JTextField(10);
		 jt2=new JTextField(10);
		 jt3=new JTextField(10);
		 jt4=new JTextField(10);
		dtm=new DefaultTableModel(str,0);
		table=new JTable(dtm);
		jsp=new JScrollPane(table);
		JPanel jp=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		jp.setLayout(new GridLayout(2,1));
		jp2.setLayout(new GridLayout(1,4));
		jp3.setLayout(new GridLayout(1,4));
		jp2.add(jl1);
		jp2.add(jt1);
		jp2.add(jl2);
		jp2.add(jt2);
		jp2.add(jl3);
		jp2.add(jt3);
		jp2.add(jl4);
		jp2.add(jt4);
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		jp3.add(jb4);
		jp.add(jp2);
		jp.add(jp3);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,350);
		this.add(jp,BorderLayout.NORTH);
		this.add(jsp,BorderLayout.CENTER);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
	}
	public static void main(String[] args) {
		Exam14 test=new Exam14();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		java.sql.Connection conn=null;
		try {
//			Class.forName("con.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/class1508?characterEncoding=gbk", "root",
					"");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (SQLException e2) {
			// TODO: handle exception
		}
	if(e.getSource().equals(jb1)){	
		if(conn!=null){
		     Statement st;
			try {
				st=conn.createStatement();
				ResultSet rs=st.executeQuery("select * from student1");
				while(rs.next()){
					String str2[]={rs.getString("ID"),rs.getString("name"),rs.getString("height"),rs.getString("age")};
				dtm.addRow(str2);
					}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}else if(e.getSource().equals(jb2)){
		if(conn!=null){
			Statement st;
			try {
				String id=jt1.getText();
				String name=jt2.getText();
				String height=jt3.getText();
				String age=jt4.getText();
				st=conn.createStatement();
				String sql=" insert into student1 values ( '" + jt1.getText()+ "'," + "'" + jt2.getText() + "' ,'"
						+ jt3.getText() + "'," + "'" + jt4.getText()+ "')";
				System.out.println(sql);
				st.executeUpdate(sql);
				System.out.println("加入成功ing");
			 String []str3={id,name,height,age};
			 dtm.addRow(str3);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}else if(e.getSource().equals(jb3)){
		if(conn!=null){
			Statement st;
			try {
				Statement s = conn.createStatement();
				String sql = "delete from student1 where ID='" + jt1.getText() + "'";
				System.out.println(sql);
				s.executeUpdate(sql);
				System.out.println("删除成功！");
			} catch (SQLException e1) {
				
				System.out.println(" 删除失败！");

			}
			
		}
	}else if(e.getSource().equals(jb4)){
		int count=table.getRowCount();
		for(int i=0;i<count-1;i++){
			dtm.removeRow(i);
		}
	}
	}

}
