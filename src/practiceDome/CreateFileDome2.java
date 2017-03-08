package practiceDome;

import java.io.*;

public class CreateFileDome2 {
  public static void creat(String path){
	  File file=new File(path);
	  if(!file.exists()){
		  if(file.mkdir()){
			  System.out.println("创建成功！");
		  }else{
			  System.out.println("创建失败！");
		  }
	  }else{
		  System.out.println("文件夹已存在！");
	  }
  }
  public static void create(String path,String Ja ){
	  File file=new File(path,Ja);
	  if(!file.exists()){
		  try {
			file.createNewFile();
			System.out.println("创建成功！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }else{
		  System.out.println("创建失败！");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
