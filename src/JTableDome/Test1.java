package JTableDome;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class Test1 extends JFrame implements ActionListener {
	DefaultTableModel dtm;
	String[] str = { "学号", "姓名", "年龄" };
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;
	JPanel jp1;
	JTable table;

	Test1() {
		super("表格的使用");
//		jsp = new JScrollPane();
		dtm = new DefaultTableModel(str,0);
		table = new JTable(dtm);
		jsp = new JScrollPane(table);
		jb1 = new JButton("添加数据");
		jb2 = new JButton("删除");
		jb3 = new JButton("修改");
		jb4 = new JButton("清空");
		jp1 = new JPanel();
	}

	void init() {
		this.setVisible(true);
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		// jsp.setViewportView(table);
		this.add(jsp);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		this.add(jp1, BorderLayout.NORTH);
		this.add(jsp, BorderLayout.CENTER);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
	}

	public static void main(String[] args) {
		new Test1().init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb1)) {
			String[] arr = { "07150", "张三", "21" };
			dtm.addRow(arr);
//			dtm.addTableModelListener(arg0);
		} else if (e.getSource().equals(jb2)) {
			int index = table.getSelectedRow();
			if (index >= 0) 
				dtm.removeRow(index);
		} else if (e.getSource().equals(jb3)) {
			int index = table.getSelectedRow();
			if (index >= 0) 
				dtm.setValueAt("李四", index,0);
			
		} else if (e.getSource().equals(jb4)) {
			int count = table.getRowCount();
			for (int i = count-1; i >= 0; i--) {
				dtm.removeRow(i);
			}
		}

	}

}
