
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//�̳��ڴ��ڸ��࣬ʵ�ִ������¼���Ӧ�Ľӿ�
public class JLoginDemo extends JFrame implements ActionListener {

	JLabel jl1, jl2;
	JTextField jtf;
	JPasswordField jpf;
	JButton jb1, jb2;

	public JLoginDemo() {
		jl1 = new JLabel("�û�����");
		jl2 = new JLabel("��     �룺");
		jtf = new JTextField(10);//������������ִ�����
		jpf = new JPasswordField(10);//��������
		jb1 = new JButton("��¼");
		jb2 = new JButton("�ر�");

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
		 * JOptionPane.showMessageDialog(JLoginDemo.this, "��¼�ɹ���"); }else{
		 * JOptionPane.showMessageDialog(JLoginDemo.this, "��¼ʧ�ܣ�"); }
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
				JOptionPane.showMessageDialog(JLoginDemo.this, "��¼�ɹ���");
			} else {
				JOptionPane.showMessageDialog(JLoginDemo.this, "��¼ʧ�ܣ�");
			}
		} else {
			System.exit(0);
		}

	}

}
