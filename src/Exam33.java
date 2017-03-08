


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

public class Exam33 extends JFrame implements ActionListener,Runnable {
   JMenuBar jmb;
   JMenu jm;
   JMenuItem FileOpen;
   JMenuItem FileClose;
   JMenu Thread;
   JMenuItem Open;
   JMenuItem close;
   
   JToolBar jtb;
   JButton jbt1,jbt2;
   JLabel jl1,jl2;
   JButton jb1,jb2;
   JTextField jt1,jt2;
   JTable table;
   JScrollPane jsp;
   DefaultTableModel dtm;
   String str[]={"学号","姓名"};
   JPanel jp;
private Connection conn;
   
   Exam33(){
	   jmb=new JMenuBar();
	   jm=new JMenu("File");
	   FileOpen=new JMenuItem("FileOpen");
	   FileClose=new JMenuItem("FileClose");
	   Thread=new JMenu("Thread");
	   Open=new JMenuItem("ThreadOpen");
	   close=new JMenuItem("ThreadClose");
	   jmb.add(jm);
	   jm.add(FileOpen);
	   jm.add(FileClose);
	   jmb.add(Thread);
	   Thread.add(Open);
	   Thread.add(close);
	   this.setJMenuBar(jmb);
	   
	   jtb=new JToolBar();
	   jbt1=new JButton("Open");
	   jbt2=new JButton("Close");
	   jtb.add(jbt1);
	   jtb.add(jbt2);
	   this.add(jtb,BorderLayout.NORTH);
	   
	   jp=new JPanel();
	   this.getContentPane().add(jp);
	   JPanel jp1=new JPanel();
	   jp.setLayout(new BorderLayout());
	   jb1=new JButton("显示");
	   jb1.addActionListener(this);
	   jb2=new JButton("隐藏");
	   jb2.addActionListener(this);
	   jt1=new JTextField(10);
	   jt2=new JTextField(10);
	   jl1=new JLabel("学号");
	   jl2=new JLabel("姓名");
	   jp1.setLayout(new FlowLayout());
	   jp1.add(jl1);
	   jp1.add(jt1);
	   jp1.add(jl2);
	   jp1.add(jt2);
	   jp1.add(jb1);
	   jp1.add(jb2);
	   jp.add(jp1,BorderLayout.NORTH);
	   
	  
	 
	   
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(450, 250);
	   
	    
	
   }
   public Connection getConnection(){
	   try {
		/*Class.forName("sun.jdbc.odbc.Driver");
		conn=(Connection) DriverManager.getConnection("jdbc:obdc:driver={Microsoft Access Driver(*.mbd)};DBQ ="+"   ");*/
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=gbk", "root",
					"");
	   } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	   
   }
    public void close(Connection conn){
    	if(conn!=null){
    		try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
	public static void main(String[] args) {
	new	Exam33();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			System.out.println("sd");
			dtm=new DefaultTableModel(str,0);
			   table=new JTable(dtm);
			   jsp=new JScrollPane(table);
			   jp.add(jsp,BorderLayout.CENTER);
		}else if(e.getSource().equals(jb2)){
			
		}
	}

}
