package JListDome;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Test3  extends JFrame implements ItemListener,ListSelectionListener{
  JLabel jl1,jl2,jl3;
  JRadioButton jc1;
  JRadioButton jc2,jc3;
  JList jlist;
  String arr[]={
		  "ϰ��ƽ ", "���ǿ","���ɽ"
  };
  ButtonGroup bg;
  JScrollPane js;
  Test3(){
	  jl1=new JLabel("�й�������ϯ��");
	  jl2=new JLabel("");
	  jl3=new JLabel(); 
	  jc1=new JRadioButton("  ϰ��ƽ");
	  jc2=new JRadioButton("  ���ǿ");
	  jc3=new JRadioButton("  ���ɽ");
	  jlist=new JList(arr);
	  js=new JScrollPane(); 
	  bg=new ButtonGroup();
  }
  void init(){
	 this.setSize(250,250);
	 this.setVisible(true);
	 this.setLayout(new GridLayout(6, 1));
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.add(jl1);
	 this.add(jc1);
	 this.add(jc2);
	 this.add(jc3);
	 js.setViewportView(jlist);
	 jlist.setVisibleRowCount(1);
	 this.add(js);
	 bg.add(jc1);
	 bg.add(jc2);
	 bg.add(jc3);
	jc1.addItemListener(this);
	jc2.addItemListener(this);
	jc3.addItemListener(this);
	jlist.addListSelectionListener(this);
	 
  }
	public static void main(String[] args) {
	new Test3().init();
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource().equals(jc1)){
			jl2.setText("��ȷ");
		}else if(e.getSource().equals(jc2)){
			jl2.setText("����");
		}else if(e.getSource().equals(jc3)){
			jl2.setText("����");
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e1) {
		if(e1.getSource().equals(jlist)){
			if(jlist.getSelectedIndex()==0){
				jl2.setText("��ȷ");
			}else{
				jl2.setText("����");
			}
		}
		
	}

}
