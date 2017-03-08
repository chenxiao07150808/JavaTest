package CreateFile;

import java.io.*;

public class Test2 {
  public static void creatfile(String path){
	  File file=new File(path);//定义一个对象
	  if(!file.exists()){//判断创建的文件是否已经存在，
		  if(file.mkdir()){//判断创建文件，成功返回TRUE 失败返回FALSE
			  System.out.println("创建成功！");
		  }else{
			  System.out.println("创建失败！");
		  }
	  }else{
		  System.out.println("文件夹已存在");
	  }
  }
  public static void createnewfile(String path,String newfile){
	  File file=new File(path,newfile );
	  if(!file.exists()){
		  try {
			file.createNewFile();
			System.out.println("文件按创建成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }else{
		  System.out.println("文件创建失败！");
	  }
  }
  public  static void Create(String path){
    File file=new File(path);
    //若目录或文件存在则返回ture;
    if(file.exists()){
    	//得到该对象所代表的目录下的FILE对象数组
    	File list[]=file.listFiles();
    	for(int i=0;i<list.length;i++){
    		if(list[i].isDirectory()){//若为目录返回ture;
    			System.out.println(list[i].getName());
    		}else{
    			System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
    		}
    	}
    }else{
    	System.out.println("文件夹不存在！");
    }
  }
	public static void main(String[] args) {
		Create("d:/");
	}

}
