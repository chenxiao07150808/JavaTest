package sportDome;

import javax.swing.JLabel;

public class Test {
	private int x, y;
	private int dir=1;
	private JLabel jl;

	public Test() {
		super();
	}

	public Test(int x, int y, JLabel jl) {
		super();
		this.x = x;
		this.y = y;
		this. jl =  jl;
	}

	public void moving() {
		if (this.y < 5 || this.y > 500) {
			this.dir = -this.dir;//实现来回转化
		}
		this.y = this.y + 8* this.dir;//运动变化的情况
		this.jl.setBounds(this.x, this.y, this.jl.getWidth(), this.jl.getHeight());
	}
}
//第一个页面只要实现小球的位置的定义和小球运动过程的变化的情况，通过定义分法实现小球运动的过程