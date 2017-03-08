package CreateFile;

import java.io.*;
public class Test1 {
	public static void createfile(String path) {
		File file = new File(path);//创建文件夹
		if (!file.exists()) {//判断是否创建文件夹成功，测试此抽象路径名表示的文件或目录是否存在
			if (file.mkdir()) {//创建此抽象路径名指定的目录。 返回：当且仅当已创建目录时，返回 true；否则返回 false 
				System.out.println("该文件夹创建成功！");
			} else {
				System.out.println("该文件夹创建失败!");
			}
		} else {
			System.out.println("该文件夹已存在！");

		}
	}
	public static void cresteNewFile(String path, String newfile) {
		File file = new File(path, newfile);
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("该文件创建成功！");
			} catch (IOException e) {
				System.out.println("该文件已存在!");
			}
		} else {
			System.out.println("该文件创建失败");
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
			String str = "中国人们爱和平！";
			byte[] b = str.getBytes();
				file.write(b);
				file.close();
		} catch (FileNotFoundException e) {
			System.out.println("失败");
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
