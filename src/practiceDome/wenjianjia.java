package practiceDome;

import java.io.File;
import java.io.IOException;

public class wenjianjia {
    public static void create(String path){
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
    public static void Create2(String path,String path1){
    	File file=new File(path,path1);
    	if(!file.exists()){
    		try {
				file.createNewFile();
				System.out.println("�����ļ��ɹ���");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
	public static void main(String[] args) {
	

	}

}
