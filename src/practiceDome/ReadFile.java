package practiceDome;

import java.io.*;

public class ReadFile {
public static void read(String path){
	File file=new File(path);
	if(file.exists()){
		File list[]=file.listFiles();
		for(int i=0;i<list[i].length();i++){
			if(list[i].isDirectory()){
				System.out.println(list[i].getName());
			}else{
				System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
			}
		}
	}else{
		System.out.println("文件不存在!");
	}
}
	public static void main(String[] args) {
		read("d:/");
	}

}
