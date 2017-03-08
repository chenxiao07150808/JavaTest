package library;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login implements ActionListener {
	JFrame jf = new JFrame("图书馆系统");
	JPanel panel = new JPanel();
	JRadioButton rb1 = new JRadioButton("用户 ");
	JRadioButton rb2 = new JRadioButton("管理员");
	Button btok = new Button("登陆");
	Button btok2 = new Button("重置");
	ButtonGroup group = new ButtonGroup();
	JTextField text = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JTextField text3 = new JTextField(20);
	Image img;
	JLabel jl1 = new JLabel("用户名");
	JLabel jl2 = new JLabel("密码");

	Login() {
		rb1.setBounds(100, 60, 100, 25);
		rb2.setBounds(200, 60, 100, 25);
		jl1.setBounds(100, 108, 80, 25);
		text.setBounds(180, 70, 200, 30);
		text2.setBounds(150, 110, 170, 30);
		jl2.setBounds(100, 150, 80, 25);
		text3.setBounds(150, 150, 170, 30);
		btok.setBounds(100, 190, 100, 30);
		btok2.setBounds(220, 190, 100, 30);
		panel.setLocation(0, 0);
		panel.setSize(800, 800);

		jf.add(panel);
		JLabel l = new JLabel();
		l.setLayout(null);
		l.setLocation(0, 0);
		l.setSize(500, 500);
		Icon icon = new ImageIcon("book.jpg"); // 在此直接创建对象
		l.setIcon(icon);
		group.add(rb1);
		group.add(rb2);
		panel.add(l);
		l.add(rb1);
		l.add(rb2);
		l.add(jl1);
		l.add(text);
		l.add(text2);
		l.add(jl2);
		l.add(text3);
		l.add(btok);
		l.add(btok2);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 400);
		jf.setLayout(null);
		panel.setLayout(null);
		jf.setVisible(true);
		jf.setResizable(false);
		text.setVisible(false);
		btok.addActionListener(this);
		btok2.addActionListener(this);
	}

	public static void main(String[] args) {
		Login t = new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(rb1)){
			new reader();
		
		}else if(e.getSource().equals(rb2)){
			new admins();
			
		}
		
	}

}
