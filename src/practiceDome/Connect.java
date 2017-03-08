package practiceDome;

import java.sql.*;

public class Connect {
    public void detete(String num){
    	Connection conn=ConnectionSQl.getConnection();
    	if(conn!=null){
    		try {
				Statement s=conn.createStatement();
				String sql="delete  from student where num="+num;
				s.executeUpdate(sql);
				System.out.println("É¾³ý³É¹¦£¡");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    }
    public void queryStudent(){
    	Connection conn=ConnectionSQl.getConnection();
    	if(conn!=null){
    		Statement s;
			try {
				s = conn.createStatement();
				ResultSet re=s.executeQuery("select * from student ");
				if(re.next()){
					System.out.println(re.getString("id"));
					System.out.println(re.getString("name"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    }
	public static void main(String[] args) {
		

	}

}
