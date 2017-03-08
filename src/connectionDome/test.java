package connectionDome;

import java.sql.*;

public class test {

	public static Connection getComnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javadb?characterEncoding=gbk", "root", "");
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			System.out.println("驱动失败");
		} catch (SQLException e) {
			System.out.println("数据库连接失败");
		}

		return conn;
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("关闭成功");
			} catch (SQLException e) {
				System.out.println("关闭失败");
			}
		}

	}

	public static void main(String[] args) {
		Connection conn = getComnection();
		if(conn!=null){
		close(conn);
			
		}
	}

}
