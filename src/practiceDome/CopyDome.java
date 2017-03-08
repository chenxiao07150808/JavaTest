package practiceDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDome {
 public static void copy(String path,String File){
	 try {
		FileInputStream fls=new FileInputStream(path);
		FileOutputStream fos=new FileOutputStream(File);
		byte []b=new byte[10];
		int len=0;
		while(len!=-1){
		len=fls.read(b, 0, b.length);
		if(len==-1){
			break;
		}
		fos.write(b, 0, len);
		System.out.println("¸´ÖÆ³É¹¦£¡");
		}
		fls.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	public static void main(String[] args) {
		copy("Test6.txt","Test7.txt");

	}

}
