package practiceDome;


import java.io.*;

public class readDome {
  public static void write(String str){
	  try {
		FileWriter fw=new FileWriter(str,true);
		String str1="中国人爱自己的国家!";
		fw.write(str1);
		fw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	  
  }
  public static void read(String str){
	  try {
		FileReader fr=new FileReader(str);
		int len=0;
		char []b=new char[10];
		while(len!=-1){
			len=fr.read(b,0,b.length);
			String str4=new String(b,0,len);
			System.out.println(str4);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
