package practiceDome;

import java.io.*;

public class CreateFileDome2 {
  public static void creat(String path){
	  File file=new File(path);
	  if(!file.exists()){
		  if(file.mkdir()){
			  System.out.println("�����ɹ���");
		  }else{
			  System.out.println("����ʧ�ܣ�");
		  }
	  }else{
		  System.out.println("�ļ����Ѵ��ڣ�");
	  }
  }
  public static void create(String path,String Ja ){
	  File file=new File(path,Ja);
	  if(!file.exists()){
		  try {
			file.createNewFile();
			System.out.println("�����ɹ���");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }else{
		  System.out.println("����ʧ�ܣ�");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
