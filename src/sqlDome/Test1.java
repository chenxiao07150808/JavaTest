package sqlDome;

import java.sql.*;

public class Test1 {
  public static Connection getconnection(){
	  Connection conn=null;
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "" );
		System.out.println("�ɹ���");
	} catch (ClassNotFoundException e) {
		System.out.println("����ʧ��");
	} catch (SQLException e) {
	System.out.println("�������ݿ�ʧ�ܣ�");
	}
	return conn;
  }
  public static void close(Connection conn){
	  if(conn!=null){
		  try {
			conn.close();
			System.out.println("�رճɹ���");
		} catch (SQLException e) {
			System.out.println("�ر�ʧ��");
		}
	  }
  }
	public static void main(String[] args) {
		 Connection conn=	getconnection();
		 if(conn!=null){
			 try {
				conn.close();
				System.out.println("�رճɹ���");
			} catch (SQLException e) {
				System.out.println("�ر�ʧ�� ��");
			}
		 }

	}

}
