package practiceDome;

import javax.swing.JLabel;

public class sportDome {
private int x,y;
private int dir=1;
private JLabel jl;

	public sportDome() {
	super();
	// TODO Auto-generated constructor stub
}

	public sportDome(int x, int y, JLabel jl) {
		super();
		this.x = x;
		this.y = y;
		this.jl = jl;
	}
public void moving(){
	if(y<=5||y>=500){
		this.dir=-this.dir;
	}
	this.y=this.y+8*this.dir;
	jl.setBounds(this.x,this.y,this.jl.getWidth(),this.jl.getHeight());
}
	

}
