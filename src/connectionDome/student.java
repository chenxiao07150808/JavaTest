package connectionDome;


public class student {
	private String num;
    private String name;	
    private int age;
    private String classname;
	public student(String num, String name, int age, String classname) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.classname = classname;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}


}
