package practiceDome;

import java.io.*;

public class ReadFileDome {
public static void readFile(String path){
	File file=new File(path);//����·��
	if(file.exists()){//�ж��ļ����Ƿ����
	File list[]=file.listFiles();//�����ȡ���ļ���
	for(int i=0;i<list.length;i++){
		if(list[i].isDirectory()){//�ж��Ƿ���Ŀ¼
			System.out.println(list[i].getName());
		}else{
			System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
		}
	}
	}else{
		System.out.println("û���ҵ��ļ���");
	}
		
}
	public static void main(String[] args) {
		readFile("d:/");

	}

}
