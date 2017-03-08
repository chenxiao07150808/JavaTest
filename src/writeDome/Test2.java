package writeDome;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	static void student(String path) {
		FileOutputStream file;
		try {
			file = new FileOutputStream(path);
			DataOutputStream newfile = new DataOutputStream(file);
			String name[] = { "赵三", "李四", "王五", "张三" };
			int[] Nos = { 120, 112, 321, 123 };
			double[] scores = { 89, 78, 81, 73 };
			for (int i = 0; i < 4; i++) {
				newfile.writeUTF(name[i]);
				newfile.writeInt(Nos[i]);
				newfile.writeDouble(scores[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//			paramString
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student("d:/test1/test3.txt");
	}

}
