package shixun;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import com.mysql.jdbc.*;
import com.mysql.jdbc.Connection;

public class Exam30 {
	public  Connection getCon(){	
		Connection conn=null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="+"D://�û�Ŀ¼//Java������Ŀ��ʼ��Ŀ¼//fd//db1.mdb"; 
			conn = (Connection) DriverManager.getConnection(url); 
			
			//Class.forName("com.mysql.jdbc.Driver");
		//conn= DriverManager.getConnection("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=D:/�û�Ŀ¼/Java������Ŀ��ʼ��Ŀ¼/fd/db1.mdb","dba","sql");  
		if(conn!=null){
			System.out.println("���ӳɹ�");
			}else{
				System.out.println("����ʧ��");	
			}
		} catch (Exception e) {
			System.out.println("��������ʧ��");
		} 
		return conn;	
	}
	public static void main(String[] args) {


	}

}
