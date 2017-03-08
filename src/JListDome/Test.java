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
   String str[]={"java��Դ�ļ�����չ��Ϊ:","����һ�������б�:","����һ�������б��"," "};
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
	jc1=new JComboBox(str1);//�����б�
	jlist=new JList(str2);
	bg=new ButtonGroup();//ѡ���鰴ť
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
	  jsp.setViewportView(jlist);//ʵ��������Ķ���
	  jlist.setVisibleRowCount(2);
	  jp2.add(jsp);
	  this.add(jp2);
	  jrb1.addActionListener(this);
	  jrb2.addActionListener(this);
	  jc1.addActionListener(this);
	  jlist.addListSelectionListener(this); //��Ӽ�����
	  this.add(jl[3]);
  }
	public static void main(String[] args) {
		new Test().init();
	}


	public void valueChanged(ListSelectionEvent e) {
	 if(e.getSource().equals(jlist)){
		 if(jlist.getSelectedIndex()==0){//��ȡѡ��ѡ��
		    jl[3].setText("��ȷ")	; //���
		 }else{
			 jl[3].setText("����");
		
		 }

	 }
		
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(jrb1)){
			jl[3].setText("����");
		}else if(arg0.getSource().equals(jrb2)){
			jl[3].setText("��ȷ");
		};
		 if(arg0.getSource().equals(jc1)){
			if(jc1.getSelectedIndex()==0){//�����˵���ѡ���ֵ��
				jl[3].setText("��ȷ")	; 
			}else{
				jl[3].setText("����")	; 
				jl[3].setForeground(Color.RED);
			}
		}
		   
	}

}
