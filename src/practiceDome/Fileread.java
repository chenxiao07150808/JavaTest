package practiceDome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileread {
	public void write(String str1,String str2){
		try {
			FileInputStream fis=new FileInputStream(str1);
			FileOutputStream fos=new FileOutputStream(str2);
			int len=0;
			byte[] b=new byte[10];
		
			while(len!=-1){
			len=fis.read(b, 0, b.length);
			if(len==-1){
				break;
			}
			fos.write(b, 0, len);
			}
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	new	Fileread().write("Test1.txt","Test3.txt ");
	}

}
