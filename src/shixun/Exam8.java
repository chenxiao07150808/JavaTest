package shixun;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Exam8 {
  public static void jia(){
	  Connection conn=(Connection) Exam7.getComnection();
	  Statement st;
	try {
		st = conn.createStatement();
		ResultSet re=st.executeQuery("select *from stu");
		while(re.next()){
			String id=re.getString("ID");
			String AA=re.getString("aa");
			
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
	public static void main(String[] args) {
	

	}

}
