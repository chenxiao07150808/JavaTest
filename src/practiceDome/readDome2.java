package practiceDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class readDome2 {
    public static void read(String path,String File){
    	try {
			FileInputStream fls=new FileInputStream(path);
			FileOutputStream fos=new FileOutputStream(File);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
