package sqlDome;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
	public void queryStudent() {
		Connection conn = Test1.getconnection();
		if (conn != null) {
			
			try {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select *from class");
				while (rs.next()) {
					System.out.print(rs.getString("id"));
					System.out.print(rs.getString("name"));
					System.out.print(rs.getInt("age"));
					System.out.println();
				}
				String str="insert into class values('zhansan','113' ,22)";
			//Statement stmt1 = conn.createStatement();
//		     stmt.executeUpdate(str);
		      String str2="delete from class where id='113' ";
		      stmt.executeUpdate(str2);
		      String str3="update class set name='李四' where id='111'";
		      stmt.executeUpdate(str3);
			} catch (SQLException e) {
				System.out.println("没有找到数据");
			}
		}
	}

	public static void main(String[] args) {
		Test2 query=new Test2();
		query.queryStudent();
	}

}
