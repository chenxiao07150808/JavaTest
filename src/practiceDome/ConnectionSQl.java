package practiceDome;

import java.sql.*;
public class ConnectionSQl {
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("con.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc.mysql://locathost:3306/javadb","root","");
			System.out.println("���ӳɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConnection(Connection conn){
		if(conn!=null){
			try {
				conn.close();
				System.out.println("�رճɹ���");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
	Connection conn=getConnection();
	
	}

}
