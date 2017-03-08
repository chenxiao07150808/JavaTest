package practiceDome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDome3 {
  public static Connection getConnecton(){
	  Connection conn=null;
	  try {
		Class.forName("con.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gdemc","root"," ");
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
			System.out.println("¹Ø±Õ³É¹¦");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
	public static void main(String[] args) {
		

	}

}
