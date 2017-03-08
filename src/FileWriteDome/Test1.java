package FileWriteDome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Test1 {
	public static void write(String path) {
		try {
			FileWriter fw = new FileWriter(path);
			String str = "弱小的心灵需要知识来武装";
			fw.write(str);
			fw.close();
			System.out.println("写入成功！");
		} catch (IOException e) {
			System.out.println(" 失败！");
		}

	}
	public static void reader(String path){
		try {
			FileReader fr=new FileReader(path);
			int len=1;
			char buf[]=new char[10];
			while(len!=-1){
				len=fr.read(buf,0,buf.length);
				if(len==-1)
					break;
				String str=new String(buf,0,len);
		        System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	  public static void copy(String path,String des){
	 try {
		BufferedReader br=new BufferedReader(new FileReader(path));
		BufferedWriter bw=new BufferedWriter(new FileWriter(des));
		String str=" ";
		int i=1;
		while(str!=null){
			str=br.readLine();
			if(str==null)
				break;
			str=i+str;
			i++;
			bw.write(str);
			bw.newLine();
			
		}
		br.close();
		bw.close();
		System.out.println("写入成功");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public static void copy1(String path,String des){
	  try {
		FileReader fr=new FileReader(path);
		FileWriter fw=new FileWriter(des);
		int len=1;
		char[]cbuf=new char[10];
		while(len!=-1){
			len=fr.read(cbuf, 0, cbuf.length);
			if(len==-1)
				break;
			fw.write(cbuf, 0, len);
		}
		fr.close();
		fw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
	public static void main(String[] args) {
//		write("Test1.txt");
//		reader("Test1.txt");
		copy("Test1.txt","Test2.txt");
	}

}
