package practiceDome;

import java.io.File;
import java.io.IOException;

public class createfileDome {
 public static void create(String path){
	File file=new File(path);
	if(!file.exists()){
		if(file.mkdir()){
			System.out.println("�����ɹ�");
		}else{
			System.out.println("����ʧ��");
		}
	}else{
		System.out.println("�ļ����Ѵ���");
	}
 }
 public static void create2(String path,String NewFile){
	 File file=new File(path,NewFile);
	 if(!file.exists()){
		 try {
			file.createNewFile();
			System.out.println("�����ɹ���");
		
		} catch (IOException e) {
		System.out.println("�ļ��Ѵ���");
		}
	 }
 }
	public static void main(String[] args) {
		create("d:/lyou");
		create2("d:/Test1","Test6.txt");

	}

}
