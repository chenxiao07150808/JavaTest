package ThreadDome;

import java.io.*;

public class Exam13 {
	public void copyFile() throws Exception {
		FileInputStream fls = new FileInputStream("Test11.txt");
		FileOutputStream fos = new FileOutputStream("Test123.txt");
		byte b[] = new byte[10];
		int len = 0;
		while (len != -1) {
			len = fls.read(b, 0, b.length);
			if (len == -1)
				break;
			fos.write(b, 0, len);
		
			
		}
		fls.close();
		fos.close();
		System.out.println("–¥»Î≥…π¶");
	}

	public static void main(String[] args) {
      try {
		new Exam13().copyFile();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      }
}