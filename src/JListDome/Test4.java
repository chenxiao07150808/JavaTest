package JListDome;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.event.*;

public class Test4 extends JFrame implements  ListSelectionListener,ActionListener{
JPanel jp1,jp2;
JLabel jl1,jl2,jl3,jl4;
JRadioButton jr1,jr2;
ButtonGroup bg;
JList jlist;
JScrollPane jsp;
JComboBox jc;
String str[]={
		"java ","ppt","doc","txt"
};
	Test4(){
		jp1=new JPanel() ;
		jp2=new JPanel();
		jl1=new JLabel("Java����չ��");
		jl2=new JLabel("���Ǹ������˵�");
		jl3=new JLabel("���Ǹ��˵�");
		jr1=new JRadioButton("java");
		jr2=new JRadioButton("ppt");
		bg=new ButtonGroup();
		jlist=new JList(str);
		jc=new JComboBox(str);
	}
	void init(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
	new Test4().init();
	

		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}


}
