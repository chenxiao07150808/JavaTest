package practiceDome;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writerDome1 {
    public static void read(String path,String File){
    	try {
			FileReader fr=new FileReader(path);
			FileWriter fw=new FileWriter(File);
			int len=0;
			while(len!=-1){
				char b[]=new char[10];
			len=fr.read(b, 0, b.length);
				if(len==-1){
					break;
				}
				fw.write(b, 0, len);
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		 read("",""); 
	}

}
