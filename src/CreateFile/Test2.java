package CreateFile;

import java.io.*;

public class Test2 {
  public static void creatfile(String path){
	  File file=new File(path);//����һ������
	  if(!file.exists()){//�жϴ������ļ��Ƿ��Ѿ����ڣ�
		  if(file.mkdir()){//�жϴ����ļ����ɹ�����TRUE ʧ�ܷ���FALSE
			  System.out.println("�����ɹ���");
		  }else{
			  System.out.println("����ʧ�ܣ�");
		  }
	  }else{
		  System.out.println("�ļ����Ѵ���");
	  }
  }
  public static void createnewfile(String path,String newfile){
	  File file=new File(path,newfile );
	  if(!file.exists()){
		  try {
			file.createNewFile();
			System.out.println("�ļ��������ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }else{
		  System.out.println("�ļ�����ʧ�ܣ�");
	  }
  }
  public  static void Create(String path){
    File file=new File(path);
    //��Ŀ¼���ļ������򷵻�ture;
    if(file.exists()){
    	//�õ��ö����������Ŀ¼�µ�FILE��������
    	File list[]=file.listFiles();
    	for(int i=0;i<list.length;i++){
    		if(list[i].isDirectory()){//��ΪĿ¼����ture;
    			System.out.println(list[i].getName());
    		}else{
    			System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
    		}
    	}
    }else{
    	System.out.println("�ļ��в����ڣ�");
    }
  }
	public static void main(String[] args) {
		Create("d:/");
	}

}
