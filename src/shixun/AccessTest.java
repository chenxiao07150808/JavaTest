package shixun;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class AccessTest implements ActionListener, ListSelectionListener{
	JFrame jfrm;
	JButton jbtnQuery;
	JButton jbtnAdd;
	JButton jbtnUpdate;
	JButton jbtnDelete;
	JLabel jl1, jl2;
	JTextField jtf1,jtf2;
	JPanel jpnl;
	JPanel jpnl2;
	JTable jtble;		
	DefaultTableModel dtm;	
	public AccessTest(){
		jfrm=new JFrame("���ݿ�����");
		jpnl=new JPanel();
		jpnl2=new JPanel();	//��ť���ļ�������
		jfrm.getContentPane().add(jpnl);
		BorderLayout jblyt=new BorderLayout();///////////��㲼��
		jpnl.setLayout(jblyt);
		
		
		jl1=new JLabel("ID");
		jpnl2.add(jl1);
		
		jtf1=new JTextField(10);
		jpnl2.add(jtf1);
		
		jl2=new JLabel("����");
		jpnl2.add(jl2);
		
		jtf2=new JTextField(10);
		jpnl2.add(jtf2);
		
		
		//��ѯ��ť
		jbtnQuery=new JButton("��ѯ");
		jbtnQuery.addActionListener(this);
		jpnl2.add(jbtnQuery);
		//���Ӱ�ť
		jbtnAdd=new JButton("����");
		jbtnAdd.addActionListener(this);
		jpnl2.add(jbtnAdd);
		//ɾ����ť
		jbtnDelete=new JButton("ɾ��");
		jbtnDelete.addActionListener(this);
		jpnl2.add(jbtnDelete);
		//���°�ť
		jbtnUpdate=new JButton("����");
		jbtnUpdate.addActionListener(this);
		jpnl2.add(jbtnUpdate);
		
		jpnl.add("North",jpnl2);/////////
		jtble=new JTable();		
		dtm=(DefaultTableModel)jtble.getModel();
		jtble.getSelectionModel().addListSelectionListener(this);
		
		dtm.addColumn("id");
		dtm.addColumn("aa");		
		JScrollPane jslpe=new JScrollPane(jtble);
		jpnl.add(jslpe,BorderLayout.CENTER);////////////////
		jfrm.setSize(600, 400);
		jfrm.setVisible(true);
		jfrm.setLocation(200,200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public  Connection getCon(){	
		Connection conn=null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="+"D:\\db1.mdb"; 
			conn = DriverManager.getConnection(url); 
			
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
	public  void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
				System.out.println("�رճɹ�");
			} catch (SQLException e) {
				System.out.println("�ر� ʧ��");
			}			
		}
	}
	
	public void queryData(){
           dtm.setRowCount(0);
		Connection conn=getCon();
		if(conn!=null){
			try{
			Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery("select * from test");	
			while(rs.next()){
				String STRid=rs.getString("id");
				String strNAME=rs.getString("name");
				String[] data=new String[]{STRid,strNAME};
				dtm.addRow(data);				
			}
			close(conn);
			}catch(Exception ee){				
			}			
		}		
	}
	
	//����
	public void addData(){
		Connection conn=getCon();
		if(conn!=null){
			try{
				PreparedStatement	pstmt = conn.prepareStatement("insert into test(id,name) values (?,?)");
				pstmt.setString(1,jtf1.getText());
				pstmt.setString(2,jtf2.getText());
			 pstmt.executeUpdate();				
			close(conn);
			}catch(Exception ee){				
			}			
		}
		queryData();
	}
	
	//����
	public void updateData(){
		Connection conn=getCon();
		if(conn!=null){
			try{
				PreparedStatement	pstmt = conn.prepareStatement("update test set name=? where id=?");
				pstmt.setString(2,jtf1.getText());
				pstmt.setString(1,jtf2.getText());
			 pstmt.executeUpdate();
			close(conn);
			}catch(Exception ee){				
			}			
		}
		queryData();
	}
	
	//ɾ��
	public void deleteData(){
		Connection conn=getCon();
		if(conn!=null){
			try{
				PreparedStatement	pstmt = conn.prepareStatement("delete from test where id=?");
				pstmt.setString(1,jtf1.getText());
			 pstmt.executeUpdate();
			close(conn);
			}catch(Exception ee){				
			}			
		}
		queryData();
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessTest newWin=new AccessTest();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jbtnQuery)){//��ѯ
			queryData();
		}
		if(e.getSource().equals(jbtnAdd)){//����
			addData();
		}
		if(e.getSource().equals(jbtnUpdate)){//����
			updateData();
		}
		if(e.getSource().equals(jbtnDelete)){//ɾ��
			deleteData();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		int index=jtble.getSelectedRow();
		if(index>=0){
		jtf1.setText(dtm.getValueAt(index, 0).toString());
		jtf2.setText(dtm.getValueAt(index, 1).toString());
		}
		
	}
}
