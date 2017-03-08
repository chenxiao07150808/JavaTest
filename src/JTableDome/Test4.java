package JTableDome;
import java.awt.*;
import java.awt.event.*;
//通过鼠标拖拉可以画一个矩形 并显示坐标
public class Test4 extends Frame implements MouseListener {	
	static int beginX,beginY,endX,endY;
	static Test4 frm;
     static Label lab;
	public static void main(String[] args) {
		frm=new Test4();
		frm.setTitle("myPaint");		
		frm.setLayout(null);
		
		lab=new Label ("矩形位置 ",Label.LEFT);
		lab.setBounds(30, 30, 150, 120);
		frm.add(lab);
		frm.addMouseListener(new Test4() );
		frm.setSize(400,300);
		frm.setVisible(true);
		
		}	
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawRect(beginX, beginY, endX-beginX, endY-beginY);
	}
	public void mousePressed(MouseEvent e) {
		beginX=e.getX();
		beginY=e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		endX=e.getX();
		endY=e.getY();
		lab.setText("（"+beginX+","+beginY+"）-（"+endX+","+endY+"）");
		frm.repaint();
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {	}
	public void mouseExited(MouseEvent e) {}
}

