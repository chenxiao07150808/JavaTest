package shixun;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Exam12 extends JFrame implements ActionListener {
	JButton jb;
	JTable table;
	JScrollPane jsp;
	DefaultTableModel dtm;
	String[] str2 = { "id", "aa" };

	Exam12() {
		jb = new JButton("´ò¿ª");
		dtm = new DefaultTableModel(str2, 0);
		table = new JTable(dtm);
		jsp = new JScrollPane(table);
		this.setVisible(true);
		this.setSize(350, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jb, BorderLayout.NORTH);
		this.add(jsp, BorderLayout.CENTER);
		jb.addActionListener(this);
	}

/*	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;*/

	public static void main(String[] args) {
		Exam12 test = new Exam12();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn;
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=gbk", "root",
						"");
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("select * from stu");
				while (rs.next()) {
					String str[] = { rs.getString("ID"), rs.getString("aa") };
					dtm.addRow(str);

				}

			} catch (SQLException f) {

			} catch (ClassNotFoundException d) {
				System.out.println("Çý¶¯Ê§°Ü");
			}
		}

	}

}
