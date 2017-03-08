package JListDome;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Test extends JFrame implements ActionListener, ListSelectionListener {
   JLabel jl[];
   String str[]={"java的源文件的扩展名为:","这是一个下拉列表:","这是一个下拉列表框"," "};
   JPanel jp1,jp2;
  JRadioButton jrb1,jrb2;
  JComboBox jc1;
  String []str1={"java","txt","doc","ppt" };
  JList jlist;
  String []str2={
		  "java","txt","doc","ppt"
  };
  ButtonGroup bg;
  JScrollPane jsp;
	Test(){
	jl=new JLabel[4];
	for(int i=0;i<jl.length;i++){
		jl[i]=new JLabel(str[i]);
	}
	jp1=new JPanel();
	jp2=new JPanel();
	jrb1=new JRadioButton("txt");
	jrb2=new JRadioButton("java");
	jc1=new JComboBox(str1);//下拉列表
	jlist=new JList(str2);
	bg=new ButtonGroup();//选项组按钮
	jsp=new JScrollPane();
  }
  void init(){
      this.setLayout(new GridLayout(6, 1));
      jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
      jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
	  this.setSize(500, 500);
	  this.setVisible(true);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.add(jl[0]);
	  this.add(jrb1);
	  this.add(jrb2);
	  bg.add(jrb1);                                             
	  bg.add(jrb2);
	  jp1.add(jl[1]);
	  jp1.add(jc1);
	  this.add(jp1);
	  jp2.add(jl[2]);
	  jsp.setViewportView(jlist);//实现下拉表的动作
	  jlist.setVisibleRowCount(2);
	  jp2.add(jsp);
	  this.add(jp2);
	  jrb1.addActionListener(this);
	  jrb2.addActionListener(this);
	  jc1.addActionListener(this);
	  jlist.addListSelectionListener(this); //添加监听器
	  this.add(jl[3]);
  }
	public static void main(String[] args) {
		new Test().init();
	}


	public void valueChanged(ListSelectionEvent e) {
	 if(e.getSource().equals(jlist)){
		 if(jlist.getSelectedIndex()==0){//获取选中选项
		    jl[3].setText("正确")	; //输出
		 }else{
			 jl[3].setText("错误");
		
		 }

	 }
		
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(jrb1)){
			jl[3].setText("错误");
		}else if(arg0.getSource().equals(jrb2)){
			jl[3].setText("正确");
		};
		 if(arg0.getSource().equals(jc1)){
			if(jc1.getSelectedIndex()==0){//下拉菜单的选项返回值！
				jl[3].setText("正确")	; 
			}else{
				jl[3].setText("错误")	; 
				jl[3].setForeground(Color.RED);
			}
		}
		   
	}

}
