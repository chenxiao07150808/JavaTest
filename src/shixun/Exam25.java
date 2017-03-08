package shixun;
class AUTO{
	double Speed;
	public void Start(){
	Speed=1;
	System.out.println("汽车启动,速度为"+this.Speed);
	}
	public void SpeedUp(){
		Speed=10;
		System.out.println("汽车加速，速度为"+this.Speed);
	}
	public void Stop(){
		Speed=0;
		System.out.println("汽车停止，速度为"+this.Speed);
	}
}
class Bus extends AUTO{
	int Passenger;
	void Geton(){
		Passenger+=this.Passenger;
	}
	void GetOff(){
		Passenger-=this.Passenger;
	}
}
public class Exam25 {

	public static void main(String[] args) {
		Bus a=new Bus();
		a.Start();
		a.SpeedUp();
		a.Stop();
		a.Geton();
		a.Geton();
	}

}
