package sportDome2;

import javax.swing.JLabel;

public class Test1 {
 private int x,y;
 private int dir;
 private JLabel jl;
 
	 Test1(int x, int y, JLabel jl2) {
	super();
	this.x = x;
	this.y = y;
	this.jl=jl;
}

	

	public Test1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void moving(){
		if(y<=5||y>=500){
			this.dir=-this.dir;
		}
		y=this.y+this.dir*1;
		jl.setBounds(this.x, this.y,this.jl.getWidth(),this.jl.getHeight());
	}

	public static void main(String[] args) {
		

	}

}
