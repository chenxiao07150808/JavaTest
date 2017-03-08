package writeDome;

import java.io.*;

public class readDome {
	public static void read(String path, String newfile) {
		File file = new File(path, newfile);
		try {
			FileInputStream los = new FileInputStream(file);
			byte[] b = new byte[10];
			int len = 1;
			while (len != -1) {
				len = los.read(b, 0, b.length);
				if (len == -1) {//求知雌处的值！
					break;
				}
				String str = new String(b, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read("d:/Test1", "test3.txt");
	}

}
