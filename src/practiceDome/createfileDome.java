package practiceDome;

import java.io.File;
import java.io.IOException;

public class createfileDome {
 public static void create(String path){
	File file=new File(path);
	if(!file.exists()){
		if(file.mkdir()){
			System.out.println("创建成功");
		}else{
			System.out.println("创建失败");
		}
	}else{
		System.out.println("文件夹已存在");
	}
 }
 public static void create2(String path,String NewFile){
	 File file=new File(path,NewFile);
	 if(!file.exists()){
		 try {
			file.createNewFile();
			System.out.println("创建成功！");
		
		} catch (IOException e) {
		System.out.println("文件已存在");
		}
	 }
 }
	public static void main(String[] args) {
		create("d:/lyou");
		create2("d:/Test1","Test6.txt");

	}

}
