package practiceDome;

import java.io.*;

public class Test2 {
public static void read(String path){
	File file=new File(path);
    if(file.exists()){
    	File list[]=file.listFiles();
    	for(int i=0;i<file.length();i++){
    		if(list[i].isDirectory()){
    			System.out.println(file.getName());
    		}else{
    			System.out.println(file.getName()+file.length()+file.canRead());
    		}
    	}
    }
}
	public static void main(String[] args) {
		read("d:/");	

	}

}
