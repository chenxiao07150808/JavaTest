package practiceDome;

import java.io.File;

public class FilePrint {
public static void print(String path){
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
		print("d:/");

	}

}
