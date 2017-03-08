package practiceDome;

import java.io.File;
import java.io.IOException;

public class CreateDome {
 public void create(String path){
	 File file =new File(path);
	 if(!file.exists()){
		 if(file.mkdir()){
			 System.out.println("创建成功！");
		 }else{
			 System.out.println("创建失败");
		 }
	 }else{
		 System.out.println("文件已存在");
	 }
 }
 
 public void create2(String path,String File){
	File file=new File(path,File);
	if(!file.exists()){
		try {
			file.createNewFile();
			System.out.println("创建文件成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		System.out.println("创建失败");
	}
 }
 public void read(String path){
	 File file=new File(path);
	 if(file.exists()){
		 File list[]=file.listFiles();
		 for(int i=0;i<list.length;i++){
			 if(list[i].isDirectory()){
				 System.out.println(list[i].getName());
			 }else{
				 System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
			 }
		 }
	 }
 }

	public static void main(String[] args) {
		

	}

}
