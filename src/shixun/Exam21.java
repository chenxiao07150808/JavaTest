package shixun;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Exam21 extends JFrame implements ActionListener,Runnable{
  JMenuBar jbr;
  JMenu File;
  JMenuItem OpenFile;
  JMenuItem closeFile;
  JMenuItem exit;
  JMenu window;
  JMenuItem help;
  JMenuItem what;
  JMenu Thread ;
  JMenuItem OpenThread;
  JMenuItem closeThread;
  JToolBar jtb;
  JButton Open ,close;
  JLabel jl1;
	Thread thread;

  Exam21(){
	  jbr=new JMenuBar();
	  File=new JMenu("File");
	  OpenFile=new JMenuItem("OpenFile");
	  OpenFile.addActionListener(this);
	  closeFile=new JMenuItem("closeFile");
	  closeFile.addActionListener(this);
	  exit=new JMenuItem("exit");
	  window=new JMenu("window");
	  help=new JMenuItem("help");
	  what=new JMenuItem("what");
	  jbr.add(File);
	  File.add(OpenFile);
	  File.add(closeFile);
	  jbr.add(window);
	  window.add(help);
	  window.add(what);
	  Thread =new JMenu("Thread");
	  OpenThread=new JMenuItem("OpenThread");
	  OpenThread.addActionListener(this);
	  closeThread =new JMenuItem("closeThread");
	  closeThread.addActionListener(this);
	  Thread.add(OpenThread);
	  Thread.add(closeThread);
	  jbr.add(Thread);
	  this.setJMenuBar(jbr);
	  
	  
	  jtb=new JToolBar();
	  Open=new JButton("OPen");
	  Open.addActionListener(this);
	  close=new JButton("close");
	  close.addActionListener(this);
	  jtb.add(Open);
	  jtb.add(close);
	  JPanel jp=new JPanel();
	  this.add(jtb,BorderLayout.NORTH);
	  this.getContentPane().add(jp);
	  jl1=new JLabel("0");
	  jp.add(jl1);
	  
	  this.setVisible(true);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setSize(350, 450);
  }
	public static void main(String[] args) {
		new Exam21 ();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(OpenThread)){
			if(thread==null){
				thread=new Thread(this);
				thread.start();
			}
		}else if(e.getSource().equals(closeThread)){
			if(thread!=null){
				thread.stop();
				thread=null;
			}
		}else if(e.getSource().equals(Open)){
			JOptionPane.showMessageDialog(this, "工具栏打开的成功之门");
		}else if(e.getSource().equals(close)){
			JOptionPane.showMessageDialog(this, "上帝关闭了门的同时，夜会为你打开窗户");
		}else if(e.getSource().equals(OpenFile)){
			JOptionPane.showMessageDialog(this, "菜单敲开成功之门");
		}
		
	}
	@Override
	public void run() {
		while(true){
			jl1.setText(new Date().toLocaleString());
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
