package writeDome;

import java.io.*;

public class readDome2 {
	public static void read(String path, String newfile) {
		File file = new File(path, newfile);
		try {
			FileInputStream fls = new FileInputStream(file);
			byte[] b = new byte[10];// 每次读取的长度
			int len = 1;
			while (len != -1) {
				len = fls.read(b, 0, b.length);//文件读取完后，返回值为-1；
				if(len==-1){//当len为-1时不再读取
					break;
				}
				String str=new String(b,0,len);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		read("d:/Test1","test3.txt");

	}

}
