package shixun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("��������Ҫ�ҵ�����");
  Scanner input=new Scanner(System.in);
  String str=input.nextLine();
  try {
	FileInputStream fls=new FileInputStream("Test11.txt");
    BufferedReader read=new BufferedReader(new InputStreamReader(fls));
    String str2="";
    int count=0;
    while((str2=read.readLine())!=null){
    	count++;
    	System.out.println();
    	if(str2.indexOf(str)!=-1){
    		System.out.println("���ڵ��к�"+count+" "+"������������������"+str2);
    	}
    }
  } catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

}
