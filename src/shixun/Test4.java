package shixun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("��������Ҫ�ҵ�����");
    BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
    String str="";
     try {
		str=re.readLine();
		System.out.println(str);
		FileInputStream fls=new FileInputStream("Test2.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fls));
		String str2="";
		int count=0;
		while((str2=br.readLine())!=null){
			count++;
			if(str2.indexOf(str)!=-1){
				System.out.println("�����ҵ��������ڵ��к�"+count+" "+"������������������: "+str2);
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
