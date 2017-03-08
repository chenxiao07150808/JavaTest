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
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="+"D://用户目录//Java工程项目初始化目录//fd//db1.mdb"; 
			conn = (Connection) DriverManager.getConnection(url); 
			
			//Class.forName("com.mysql.jdbc.Driver");
		//conn= DriverManager.getConnection("jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=D:/用户目录/Java工程项目初始化目录/fd/db1.mdb","dba","sql");  
		if(conn!=null){
			System.out.println("连接成功");
			}else{
				System.out.println("连接失败");	
			}
		} catch (Exception e) {
			System.out.println("驱动加载失败");
		} 
		return conn;	
	}
	public static void main(String[] args) {


	}

}
