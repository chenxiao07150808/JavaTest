package practiceDome;

import java.io.File;

public class FileDome2 {
 public static  void creat(String str){
	 File file=new File(str);
	 if(!file.exists()){
		 file.mkdir();
	 }else{
		 System.out.println("文件创建失败！");
	 }
 }
	public static void main(String[] args) {
		creat("");
	}

}
