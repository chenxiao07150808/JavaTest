package practiceDome;

import java.io.*;

public class readerDome {
  public static void read(String path){
	  File file=new File(path);
	 File list[]=file.listFiles();
	 for(int i=0;i<list.length;i++){
		 if(list[i].isDirectory()){
			 System.out.println(list[i].getName());
		 }else{
			 System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
		 }
	 }
	  
  }
	public static void main(String[] args) {
		read("d:/");
	}
	
}
