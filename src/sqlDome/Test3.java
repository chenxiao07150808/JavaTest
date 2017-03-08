package sqlDome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

public class Test3 extends JFrame implements ActionListener{
     JLabel jl1,jl2,jl3,jl4;
     JTextField jt[];
     JPanel jp1,jp2,jp3,jp4;
     JButton jb[];
     JTable table;
     JScrollPane jsp;
     String []str={"学号","姓名","年龄","班级"};
     String str1[]={" ","软件8班","物联网","室内设计","商务英语"};
     String str2[]={"添加","删除","修改","清除"};
     DefaultTableModel dtm;
     JComboBox jc;
	Test3(){
		jl1=new JLabel("学号");
		jl2=new JLabel("姓名");
		jl3=new JLabel("年龄");
		jl4=new JLabel("班级");
	    jt=new JTextField[10];
	    for(int x=0;x<jt.length;x++){
	    	jt[x]=new JTextField(10);
	    }
	   jc=new JComboBox(str1);
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
	    jb=new JButton[4];
	    for(int i=0;i<jb.length;i++){
	    	jb[i]=new JButton(str2[i]);
	    }
	    dtm=new DefaultTableModel(str,0);
	    table=new JTable(dtm);
	    jsp=new JScrollPane(table);
		table.setGridColor(Color.red);
		table.setBackground(Color.lightGray);
		table.setSelectionBackground(Color.WHITE);
   }
   void init(){
	   this.setSize(350, 350);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setLayout(new BorderLayout()); 
	   jp1.add(jl1);
	   jp1.add(jt[0]);
	   jp1.add(jl2);
	   jp1.add(jt[1]);
	   jp2.add(jl3);
	   jp2.add(jt[2]);
	   jp2.add(jl4);
	   jp2.add(jc);
	   jp3.add(jb[0]);
	   jp3.add(jb[1]);  
	   jp3.add(jb[2]); 
	   jp3.add(jb[3]);
	   jp4.add(jp1);
	   jp4.add(jp2);
	   jp4.add(jp3);
	   jp4.setLayout(new GridLayout(3,1));
	   this.add(jp4,BorderLayout.NORTH);
	   this.add(jsp,BorderLayout.CENTER);
	   jb[0].addActionListener(this);
	   jb[1].addActionListener(this);
	   jb[2].addActionListener(this);
	   jb[3].addActionListener(this);
	   
   }
	   public static void main(String[] args) {
    new Test3().init();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
		if(e.getSource().equals(jb[0])){
//			String str[]={jt[0].getText(),jt[1].getText(),jt[2].getText(),jc.getSelectedItem().toString()};
//			dtm.addRow(str);
			Connection conn = Test1.getconnection();
			try {
				Statement stmt = conn.createStatement();
				String str="insert into class values(jt[1].getText(),jt[0].getText() ,Integer.parseInt(jt[2].getText()))";
				 stmt.executeUpdate(str);
				 System.out.println("百村成功");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jt[0].setText(" ");
			jt[1].setText(" ");
			jt[2].setText(" ");
			
		} else if (e.getSource().equals(jb[1])) {
			int index = table.getSelectedRow();
			if (index >= 0) 
				dtm.removeRow(index);
		} else if (e.getSource().equals(jb[2])) {
			try{
			int index = table.getSelectedRow();
			int indexc=table.getSelectedColumn();
			
			if (index >= 0&&indexc<3) {
				dtm.setValueAt("", index,indexc);
			    dtm.setValueAt(jt[indexc].getText(), index, indexc);
			 }
				dtm.setValueAt(jc.getSelectedItem().toString(), index, 3);
			}catch(ArrayIndexOutOfBoundsException a){
				JOptionPane.showMessageDialog(null, "请选中修改项后操作");
			}
		} else if (e.getSource().equals(jb[3])) {
			JOptionPane.showMessageDialog(null, "你确定清空所有的数据吗？清空后将无法找回数据");
			int count = table.getRowCount();
			for (int i = count-1; i >= 0; i--) {
				dtm.removeRow(i);
			}
		}
		
	}

}
