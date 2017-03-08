package practiceDome;

import java.io.*;

public class ReadFileDome {
public static void readFile(String path){
	File file=new File(path);//抽象路径
	if(file.exists()){//判断文件夹是否存在
	File list[]=file.listFiles();//保存读取的文件名
	for(int i=0;i<list.length;i++){
		if(list[i].isDirectory()){//判断是否是目录
			System.out.println(list[i].getName());
		}else{
			System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
		}
	}
	}else{
		System.out.println("没有找到文件夹");
	}
		
}
	public static void main(String[] args) {
		readFile("d:/");

	}

}
