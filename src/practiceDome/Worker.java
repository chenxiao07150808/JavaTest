package practiceDome;

public class Worker {
 private String name;
 private int num;
 private double bount;
 private double baise;
 
	public Worker() {
	super();
	// TODO Auto-generated constructor stub
}

	public Worker(String name, int num, int bount, int baise) {
		super();
		this.name = name;
		this.num = num;
		this.bount = bount;
		this.baise = baise;
	}
	
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getBount() {
		return bount;
	}

	public void setBount(double bount) {
		this.bount = bount;
	}

	public double getBaise() {
		return baise;
	}

	public void setBaise(double baise) {
		this.baise = baise;
	}

double getTax(){
	   if(this.bount+this.baise>1600){
		   return 0.15*(this.baise+this.bount-1600);
	   }else{
		   return 0;
	   }
	   
   }
   double main(){
	   return this.baise+this.bount-this.getTax();
   }
	public static void main(String[] args) {
		Worker worker=new Worker("³ÂÏþ", 12, 100000, 10000);
		System.out.println(worker.getName());
		System.out.println(worker.getTax());
		System.out.println(worker.main());

	}

}
