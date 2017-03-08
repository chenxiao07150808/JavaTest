
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//继承于窗口父类，实现窗口中事件对应的接口
public class JLoginDemo extends JFrame implements ActionListener {

	JLabel jl1, jl2;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb1, jb2;

	public JLoginDemo() {
		jl1 = new JLabel("用户名：");
		jl2 = new JLabel("密     码：");
		jtf = new JTextField(10);//括号里面的数字代表长度
		jpf = new JPasswordField(10);//密码框设计
		jb1 = new JButton("登录");
		jb2 = new JButton("关闭");

	}

	public void init() {

		this.add(jl1);
		this.add(jtf);
		this.add(jl2);
		this.add(jpf);
		this.add(jb1);
		this.add(jb2);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setSize(250, 200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		/*
		 * jb1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent arg0) {
		 * if(jtf.getText().equals("admin")&&jpf.getText().equals("123456")){
		 * JOptionPane.showMessageDialog(JLoginDemo.this, "登录成功！"); }else{
		 * JOptionPane.showMessageDialog(JLoginDemo.this, "登录失败！"); }
		 * 
		 * } }); jb2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent arg0) {
		 * System.exit(0);
		 * 
		 * } });
		 * 
		 */
	}

	public static void main(String[] args) {
		JLoginDemo login = new JLoginDemo();
		login.init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb1)) {
			if (jtf.getText().equals("admin") && jpf.getText().equals("123456")) {
				JOptionPane.showMessageDialog(JLoginDemo.this, "登录成功！");
			} else {
				JOptionPane.showMessageDialog(JLoginDemo.this, "登录失败！");
			}
		} else {
			System.exit(0);
		}

	}

}
