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
			this.dir = -this.dir;//ʵ������ת��
		}
		this.y = this.y + 8* this.dir;//�˶��仯�����
		this.jl.setBounds(this.x, this.y, this.jl.getWidth(), this.jl.getHeight());
	}
}
//��һ��ҳ��ֻҪʵ��С���λ�õĶ����С���˶����̵ı仯�������ͨ������ַ�ʵ��С���˶��Ĺ���