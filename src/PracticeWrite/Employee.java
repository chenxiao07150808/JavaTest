package PracticeWrite;

public class Employee {
public String name="";
public int age=0;
public static final int LEN=8;
public Employee(String name,int age){
	if(name.length()>LEN){
		name=name.substring(0, LEN);
	}else{
		while (name.length()<LEN){
			name+="\u0000";
		}
	}
	this.name=name;
	this.age=age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
