package practiceDome;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JDenglu extends JFrame implements ActionListener{
 JButton jb1,jb2;
 JLabel jl1 ,jl2;
 JPasswordField jpw;
 JTextField jt1;
 
JDenglu(){
	jb1=new JButton("µÇÂ¼");
	jb2=new JButton("ÖØÖÃ");
	jl1=new JLabel("ÐÕÃû");
	jl2=new JLabel("ÃÜÂë");
	jpw=new JPasswordField(10);
	jt1=new JTextField(10);
}
void init(){
	this.setVisible(true);
	this.setSize(150,200);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.add(jl1);
	this.add(jt1);
	this.add(jl2);
	this.add(jpw);
	this.add(jb1);
	this.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
}
	public static void main(String[] args) {
		new JDenglu().init();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb1)){
			if(jt1.getText()=="³ÂÏþ"&&jpw.getText()=="123456"){
			JOptionPane.showInputDialog("µÇÂ¼³É¹¦!");
			}else{
				JOptionPane.showInputDialog("µÇÂ¼Ê§°Ü!");
			}
		}else if(e.getSource().equals(jb2)){
			jt1.setText("" );
			jpw.setText("");
		}
		
	}

}
