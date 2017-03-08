package connectionDome;

import java.sql.*;
import java.util.*;

public class test1 {

	public List queryStudent() {
		List list = new ArrayList();
		Connection conn = test.getComnection();

		if (conn != null) {
			try {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select * from student");
				while (rs.next()) {
					String num = rs.getString("num");
					String name = rs.getString("name");
					String classname = rs.getString("classname");
					int age = rs.getInt("age");
					student stu = new student(num, name, age, classname);
					list.add(stu);
				}

			} catch (SQLException e) {

			}
			test.close(conn);
		}
		return list;
	}

	public boolean delete(String num) {
		boolean flag1 = false;
		Connection conn = test.getComnection();
		if (conn != null) {
			try {
				Statement s = conn.createStatement();
				String sql = "delete from student where num='" + num + "'";
				s.executeUpdate(sql);
				System.out.println("É¾³ý³É¹¦£¡");
				flag1 = true;
			} catch (SQLException e) {
				System.out.println(" É¾³ýÊ§°Ü£¡");

			}
		}
		return flag1;
	}

	public boolean insert(student stu) {
		Connection conn = test.getComnection();
		boolean flag = false;
		if (conn != null) {
			Statement s;
			try {
				s = conn.createStatement();
				String sql = " insert into student values ( '" + stu.getNum() + "'," + "'" + stu.getName() + "' ,"
						+ stu.getAge() + "," + "'" + stu.getClassname() + "')";
				System.out.println(sql);
				s.executeUpdate(sql);
				System.out.println("Ìí¼Ó³É¹¦£¡");
				flag = true;
			} catch (SQLException e) {
				System.out.println("Ìí¼ÓÊ§°Ü£¡");
			}
			test.close(conn);
		}
		return flag;
	}

	public List cha(String str) {
		List list1 = new ArrayList();
		Connection conn = test.getComnection();
		if (conn != null) {
			try {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select * from student where classname='" + str + "'");
				while (rs.next()) {
					String num = rs.getString("num");
					String name = rs.getString("name");
					String classname = rs.getString("classname");
					int age = rs.getInt("age");
					student stu = new student(num, name, age, classname);
					list1.add(stu);
				}
			} catch (SQLException e) {

			}
		}
		return list1;
	}

	public boolean qiu(String num, student stu) {
		boolean flag = false;
		Connection conn = test.getComnection();
		if (conn != null) {
			try {
				Statement s = conn.createStatement();
				String sql = "update student set num='" + stu.getNum() + "'," + "name='" + stu.getName() + "'," + "age="
						+ stu.getAge() + ",classname='" + stu.getClassname() + "' where num='" + num + "'";
				System.out.println(sql);
				s.executeUpdate(sql);
				System.out.println("ÐÞ¸Ä³É¹¦£¡");
				flag=false;
			} catch (SQLException e) {
				System.out.println("ÐÞ¸ÄÊ§°Ü£¡");
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		test1 query = new test1();
		// query.queryStudent();
		// query.delete("5");
		// query.insert(new student("5","³ÄÉÀ´ó¼Ò",20,"Èí¼þ1509"));
		// //query.qiu("1",new student("6","asdsa",12 ,"es"));
	}

}
