package shixun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam26 {

	public static void main(String[] args) {
		try {
			FileInputStream fls=new FileInputStream("Test11.txt");
		FileOutputStream fos=new FileOutputStream("Test234.txt");
		byte[] b=new byte[fls.available()];
		fls.read(b);
		fos.write(b);
		System.out.println("–¥»Î≥…π¶");
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

}
