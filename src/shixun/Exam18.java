package shixun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam18 {

	public static void main(String[] args) {
		 StringBuilder sb=new StringBuilder();
		 String file="Test11.txt";
		 BufferedReader bf;
		 String str="";
		 int a=1,b=0,c=0,d=0,f=0;
		 try {
			bf=new BufferedReader(new FileReader(file));
		  while((str=bf.readLine())!=null){
			  for(int i=0;i<str.length();i++){
				  if("a".equals(str.charAt(i))){
					  a++;
					  System.out.println("s");
				  }else if("b".equals(str.charAt(i))){
					  b++;
				  }
			  }
		  }
		  System.out.println("a个数"+a);
		  System.out.println("b的个数"+b);
		  System.out.println("c的个数"+c);
		  System.out.println("d的个数"+d);
		  System.out.println("f的个数"+f);
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
