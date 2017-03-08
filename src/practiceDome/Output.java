package practiceDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
 public static void input(String path,String File){
	 try {
		FileInputStream fls=new FileInputStream(path);
		FileOutputStream fos=new FileOutputStream(File);
		int len=0;
		while(len!=-1){
			byte []b=new byte[10];
		len=fls.read(b, 0, b.length);
			if(len==-1){
				break;
			}
			fos.write(b, 0, len);
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
		

	}

}
