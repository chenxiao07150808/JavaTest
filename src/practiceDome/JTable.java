package practiceDome;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTable extends JFrame implements ActionListener {
	JButton jb1,jb2;
	JLabel jl1,jl2;
	JTextField jt1,jt2;
	JTable(){
		jl1=new JLabel("����");
		jl2=new JLabel("����");
		jb1=new JButton("��½");
		jb2=new JButton("����");
		jt1=new JTextField(10);
		jt2=new JTextField(10);
	}
	public void init(){
		this.setVisible(true);
		this.setSize(250, 250);
		this.setLayout(new FlowLayout());
		this.add(jl1);
		this.add(jt1);
		this.add(jl2);
		this.add(jt2);
		this.add(jb1);
		this.add(jb2);
	}

	public static void main(String[] args) {
		new JTable().init();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			if(jt1.getText()=="zhn"&&jt2.getText()=="23"){
				System.out.println("��½�ɹ�");
			}else{
				System.out.println("��½ʧ��");
			}
		}else if(e.getSource().equals(jb2)){
			jt1.setText(null);
			jt2.setText(null);
		}
		
	}

}
