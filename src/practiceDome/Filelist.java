package practiceDome;

import java.io.File;

public class Filelist {
public static void read(String str){
	File file=new File(str);
	if(file.exists()){
		File list[]=file.listFiles();
		for(int i=0;i<list.length;i++){
			if(list[1].isDirectory()){
			System.out.println(	list[i].getName());
				
			}else{
				System.out.println(list[i].getName()+list[i].length()+list[i].canRead());
			}
		}
	}else{
		System.out.println();
	}
}
	public static void main(String[] args) {
		
	}

}
