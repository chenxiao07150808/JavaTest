package practiceDome;

import java.io.*;
public class WriterDome {
  public static void Write(String path,String file){
	  try {
		FileWriter fw=new FileWriter(path);
		FileReader fr=new FileReader(file);
		int len=0;
	     while(len!=-1){
	    	 char[]e=new char[10];
	    	len= fr.read(e, 0,e.length);
	    	if(len==-1){
	    		break;
	    	}
	    	 fw.write(e, 0, len);
	    	 System.out.println("–¥»Î≥…π¶");
	     }
	     fr.close();
	     fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
	public static void main(String[] args) {
		Write("Test8.txt","Test7.txt");
	}

}
