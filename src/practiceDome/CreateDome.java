package practiceDome;

import java.io.File;
import java.io.IOException;

public class CreateDome {
 public void create(String path){
	 File file =new File(path);
	 if(!file.exists()){
		 if(file.mkdir()){
			 System.out.println("�����ɹ���");
		 }else{
			 System.out.println("����ʧ��");
		 }
	 }else{
		 System.out.println("�ļ��Ѵ���");
	 }
 }
 
 public void create2(String path,String File){
	File file=new File(path,File);
	if(!file.exists()){
		try {
			file.createNewFile();
			System.out.println("�����ļ��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else{
		System.out.println("����ʧ��");
	}
 }
 public void read(String path){
	 File file=new File(path);
	 if(file.exists()){
		 File list[]=file.listFiles();
		 for(int i=0;i<list.length;i++){
			 if(list[i].isDirectory()){
				 System.out.println(list[i].getName());
			 }else{
				 System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
			 }
		 }
	 }
 }

	public static void main(String[] args) {
		

	}

}
