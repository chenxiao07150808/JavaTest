package writeDome;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
   public static void write(String path){
	   try {
		FileOutputStream file=new FileOutputStream(path);
		String str="acbdkdf 我是在写文件哦！";
		byte[]b=str.getBytes();
		file.write(b);
	   } catch (FileNotFoundException e) {
		   e.printStackTrace();
	   }catch (IOException e) {
		e.printStackTrace();
	}
	   
   }
	public static void main(String[] args) {
		write("d:/Test1/test3.txt");

	}

}
