package practiceDome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sportDome23 {
	public static Connection getConnnection() {
		Connection conn = null;
		try {
			Class.forName("con.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://locatlhost:3306/javadb", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}
	public static void close(Connection conn){
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

	}

}
