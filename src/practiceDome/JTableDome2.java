package practiceDome;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class JTableDome2 extends JFrame{
	JLabel jl[];
	String str1[]={"学号","姓名","年龄","班级"};
	JButton jb[];
	String str2[]={"添加","删除","修改","查询"};
	JComboBox jc;
	String str3[]={"软件1508","室内设计","嵌入技术","电气自动化"};
	JPanel jp1,jp2,jp3;
	JTextField jt1,jt2,jt3;
	JTable table;
	DefaultTableModel dtm;
	JScrollPane jsp;
	JTableDome2(){
		jl=new JLabel[4];
		for(int i=0;i<4;i++){
			jl[i]=new JLabel(str1[i]);
		}
		jb=new JButton [4];
		for(int i=0;i<4;i++){
			jb[i]=new JButton(str2[i]);
		}
		jc=new JComboBox(str3);
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jt3=new JTextField(10);
		dtm=new DefaultTableModel(str1, 0);
		table =new JTable();
		jsp=new JScrollPane(table);
	}
	void init(){
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		jp1.add(jl[0]);
		jp1.add(jt1);
		jp1.add(jl[1]);
		jp1.add(jt2);
		jp1.add(jl[2]);
		jp1.add(jt3);
		jp1.add(jc);
		jp2.add(jb[0]);
		jp2.add(jb[1]);
		jp2.add(jb[2]);
		jp2.add(jb[3]);
		jp3.add(jp1);
		jp3.add(jp2);
		jp3.setLayout(new GridLayout(2,1));
		this.add(jsp,BorderLayout.CENTER);
		this.add(jp3,BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		new JTableDome2().init();

	}

}
