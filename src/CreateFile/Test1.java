package CreateFile;

import java.io.*;
public class Test1 {
	public static void createfile(String path) {
		File file = new File(path);//�����ļ���
		if (!file.exists()) {//�ж��Ƿ񴴽��ļ��гɹ������Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ����
			if (file.mkdir()) {//�����˳���·����ָ����Ŀ¼�� ���أ����ҽ����Ѵ���Ŀ¼ʱ������ true�����򷵻� false 
				System.out.println("���ļ��д����ɹ���");
			} else {
				System.out.println("���ļ��д���ʧ��!");
			}
		} else {
			System.out.println("���ļ����Ѵ��ڣ�");

		}
	}
	public static void cresteNewFile(String path, String newfile) {
		File file = new File(path, newfile);
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("���ļ������ɹ���");
			} catch (IOException e) {
				System.out.println("���ļ��Ѵ���!");
			}
		} else {
			System.out.println("���ļ�����ʧ��");
		}
	}

	public static void getCreatefile(String path) {
		File file = new File(path);
		if (file.exists()) {
			File list[] = file.listFiles();
			for (int i = 0; i < list.length; i++) {
				if (list[i].isDirectory()) {
					  System.out.println(list[i].getName());
				} else {
					System.out.println(list[i].getName() + list[i].length() + list[i].canRead());
				}
			}
		} else {
			System.out.println();
		}
	}
	public static void write(String path) {
		try {
			FileOutputStream file = new FileOutputStream(path);
			String str = "�й����ǰ���ƽ��";
			byte[] b = str.getBytes();
				file.write(b);
				file.close();
		} catch (FileNotFoundException e) {
			System.out.println("ʧ��");
			} catch (IOException e) {

			}
		}
	



	public static void main(String[] args) {
//		createfile("d:/test");
//		cresteNewFile("d:/test", "test1.php");
//		getCreatefile("d:/");
		write("d:/test/test1.php");
	}

}
