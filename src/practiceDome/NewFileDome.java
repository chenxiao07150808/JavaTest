package practiceDome;

import java.io.*;

public class NewFileDome {
	public static void creat(String path, String File) {
		File file = new File(path, File);//第一个参数传一个一斤存在的文件夹，第二个为创建的文件名称
		if (!file.exists()) {//判断文件是否已经存在
			try {
				file.createNewFile();//创建文件
			} catch (IOException e) {
				System.out.println("创建失败！");

			}
		}else{
			System.out.println("文件已存在！");
		}
	}

	public static void main(String[] args) {
		creat("","");
	}

}
