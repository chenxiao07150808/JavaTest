package writeDome;

import java.io.*;

public class Exam1 {

	public void writeFile(String src, String des) {
		try {
			FileInputStream fls = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			int len = 1;
			byte b[] = new byte[10];
			while (len != -1) {
				len = fls.read(b, 0, b.length);
				if (len == -1) {
					break;
				}
				String str = new String(b, 0, len);
				str = str.toUpperCase();
				fos.write(str.getBytes());
			}
			fls.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("没有找到文件!");
		} catch (IOException e) {
			System.out.println("失败！");
		}
	}

	public static void main(String[] args) {
		try {
			new Exam1().writeFile("d:/Test1/Test2.txt", "d:/Test1/test3.txt");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
