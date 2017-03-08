package JListDome;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	   String name;
	   int age;
	   public String getName(){
		   return name;
	   }
	   public int getAge(){
		   return age;
	   }
	   public Student(String name,int age){
		   this.name=name;
		   this.age=age;
		   
	   }
}
public class IteratorDemo {

   
	public static void main(String[] args) {
		Student stu1=new Student("chen",12);
		Student stu2=new Student("js",23);
		Student	 stu3=new Student("dj",23);
		Student stu4=new Student("jfdi",34);
List list=new ArrayList();
list.add(stu1);
list.add(stu3);
list.add(stu4);
list.add(stu2);
for(int i=0;i<list.size();i++){
   Student stu=(Student)list.get(i);
System.out.println(stu.getName()+stu.age);
	}
	}
}
