package sportDome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 extends JFrame implements ActionListener{
   JButton  jb;
   Test3(){
	 jb=new JButton("开始运动");  
   }
   void init(){
	   this.setVisible(true);
	   this.setSize(500,600);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setLayout(null);
	   this.add(jb);
	   jb.setBounds(0, 0, 100, 100);
	   jb.addActionListener(this);
   }
	public static void main(String[] args) {
		Test3 test3=new Test3();
		test3.init();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)){
			int x=(int)(Math.random()*495+5);
			int y=(int)(Math.random()*495+5);
    		JLabel jl=new JLabel(new ImageIcon("timg.gif"));
			//JLabel jl=new JLabel("我爱大家");
			this.add(jl);
			jl.setBounds(x, y,100,100);
			Test2 test2=new Test2(x, y, jl);
		  test2.start();
	}
	}
}
