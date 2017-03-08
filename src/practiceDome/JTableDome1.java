package practiceDome;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JTableDome1 extends JFrame {
  JLabel jl1,jl2;
  JButton jb1;
	JTableDome1(){
		jl1=new JLabel("°®Äã¿©£¡");
		jl2=new JLabel(new ImageIcon("1.gif"));
		jb1=new JButton("ÖÐ¹úÈË",new ImageIcon("1.gif"));
	}
	void init(){
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(jl1);
		this.add(jl2);
		this.add(jb1);
	}
	public static void main(String[] args) {
		new JTableDome1().init();
	}

}
