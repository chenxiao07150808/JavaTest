package sportDome2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 extends JFrame implements ActionListener{
  JButton jb;
  
 Test3() {
	jb=new JButton("¿ªÊ¼");
}
 void init(){
	 this.setSize(400,520);
	 this.setVisible(true);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLayout(null);
	 this.add(jb);
	 jb.setBounds(0, 0, 100,100);
	 jb.addActionListener(this);
 }

	public static void main(String[] args) {
		Test3 test=new Test3();
		test.init();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jb)){
			int x=(int)Math.random()*45+5;
			int y=(int)Math.random()*45+5;
			JLabel jl=new JLabel(new ImageIcon());
			jl.setBounds(x, y, 100, 100);
			this.add(jl);
			Test2 test2=new Test2(x, y, jl);
			Thread t=new Thread(test2);
			t.start();
		}
		
	}

}
