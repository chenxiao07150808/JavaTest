package practiceDome;

import java.io.*;

public class NewFileDome {
	public static void creat(String path, String File) {
		File file = new File(path, File);//��һ��������һ��һ����ڵ��ļ��У��ڶ���Ϊ�������ļ�����
		if (!file.exists()) {//�ж��ļ��Ƿ��Ѿ�����
			try {
				file.createNewFile();//�����ļ�
			} catch (IOException e) {
				System.out.println("����ʧ�ܣ�");

			}
		}else{
			System.out.println("�ļ��Ѵ��ڣ�");
		}
	}

	public static void main(String[] args) {
		creat("","");
	}

}
