package sqlDome;

import java.sql.*;

public class Test1 {
  public static Connection getconnection(){
	  Connection conn=null;
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "" );
		System.out.println("成功！");
	} catch (ClassNotFoundException e) {
		System.out.println("加载失败");
	} catch (SQLException e) {
	System.out.println("连接数据库失败！");
	}
	return conn;
  }
  public static void close(Connection conn){
	  if(conn!=null){
		  try {
			conn.close();
			System.out.println("关闭成功！");
		} catch (SQLException e) {
			System.out.println("关闭失败");
		}
	  }
  }
	public static void main(String[] args) {
		 Connection conn=	getconnection();
		 if(conn!=null){
			 try {
				conn.close();
				System.out.println("关闭成功！");
			} catch (SQLException e) {
				System.out.println("关闭失败 ！");
			}
		 }

	}

}
