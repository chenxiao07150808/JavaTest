package practiceDome;

import java.io.File;
import java.io.IOException;

public class wenjianjia {
    public static void create(String path){
    	File file=new File(path);
    	if(!file.exists()){
    		if(file.mkdir()){
    			System.out.println("创建成功！");
    		}else{
    			System.out.println("创建失败！");
    		}
    	}else{
    		System.out.println("文件夹已存在！");
    	}
    }
    public static void Create2(String path,String path1){
    	File file=new File(path,path1);
    	if(!file.exists()){
    		try {
				file.createNewFile();
				System.out.println("创建文件成功！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
	public static void main(String[] args) {
	

	}

}
