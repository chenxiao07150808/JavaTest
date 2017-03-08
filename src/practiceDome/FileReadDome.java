package practiceDome;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadDome {
 public static void read(String path,String File){
	 try {
		FileWriter fw=new FileWriter(path);
		FileReader fr=new FileReader(File);
		String str="中国预计在2017年攻打菲律宾";
		fw.write(str);
		fw.close();
		int len=0;
		while(len!=-1)
		{		
			char[]a=new char[10];
			len=fr.read(a, 0, a.length);
			if(len==-1){
				break;
			}
			String str2=new String(a,0,len);
			System.out.println(str2);
		}
     fr.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	public static void main(String[] args) {
	read("Test6.txt","Test3.txt");

	}

}
