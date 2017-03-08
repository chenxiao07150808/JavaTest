package shixun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam16 {
public void CopyFile(){
	FileInputStream fls;
	try {
		fls = new FileInputStream("Test11");
		FileOutputStream fos=new FileOutputStream("Test122.txt");
		byte b[]=new byte[fls.available()];
		fls.read(b);
		fos.write(b);
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
		// TODO Auto-generated method stub
 new Exam16().CopyFile();
	}

}
