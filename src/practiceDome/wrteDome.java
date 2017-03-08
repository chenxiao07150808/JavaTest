package practiceDome;

import java.io.*;

public class wrteDome {
	public static void write(String str) {
		try {
			FileWriter fw = new FileWriter(str, true);
			String str1 = "我们爱中国，中国是我们的祖国。";
			fw.write(str1);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void read(String str) {
		try {
			FileReader fr = new FileReader(str);
			int len = 0;
			while (len != -1) {
				char a[] = new char[10];
				len = fr.read(a, 0, a.length);
				if (len == -1) {
					break;
				}
				String str2 = new String(a, 0, len);
				System.out.println(str2);
			}
			fr.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		write("Test3.txt");

	}

}
