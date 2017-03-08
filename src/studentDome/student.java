package studentDome;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class student {

	String name;
	int no;
	double score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	void input() {
	
		System.out.println("请输入学号");
		Scanner input = new Scanner(System.in);
		no = input.nextInt();
		System.out.println("请输入姓名！");
		Scanner input2 = new Scanner(System.in);
		name = input2.next();
		System.out.println("请输入成绩！");
		Scanner input3 = new Scanner(System.in);
		score = input.nextDouble();

	}
	void show(String name, int no, double score) {
      System.out.println(name+no+score);
	}
   void save(String path){
	  FileOutputStream flo;
	  try {
		flo=new FileOutputStream(path,true);
		String []str={getName(),getScore()+"",getNo()+""};
		for(int i=0;i<str.length;i++){
			byte []b=str[i].getBytes();
			flo.write(b);
		}
	
	  } catch (FileNotFoundException e) {
		  e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		student a=new student();
		a.input();
		a.show(a.getName(),a.getNo(),a.getScore());
		a.save("d:/Test1/test3.txt");
	}

}
