package shixun;
import java.sql.*;

public class Exam7 {

	public static Connection getComnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java?characterEncoding=gbk", "root", "");
			System.out.println("���ӳɹ�");
		} catch (ClassNotFoundException e) {
			System.out.println("����ʧ��");
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ��");
		}

		return conn;
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("�رճɹ�");
			} catch (SQLException e) {
				System.out.println("�ر�ʧ��");
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

