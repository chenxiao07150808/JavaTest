package writeDome;

import java.io.*;

public class readDome2 {
	public static void read(String path, String newfile) {
		File file = new File(path, newfile);
		try {
			FileInputStream fls = new FileInputStream(file);
			byte[] b = new byte[10];// ÿ�ζ�ȡ�ĳ���
			int len = 1;
			while (len != -1) {
				len = fls.read(b, 0, b.length);//�ļ���ȡ��󣬷���ֵΪ-1��
				if(len==-1){//��lenΪ-1ʱ���ٶ�ȡ
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
