package practiceDome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputDome {
	public static void read(String path,String File){
 try {
	FileInputStream fls=new FileInputStream(path);
	FileOutputStream fos=new FileOutputStream(File);
	int len=0;
	while(len!=-1){
	byte []a=new byte[10];
	len=fls.read(a, 0, a.length);
	if(len==-1){
		break;
	}
	fos.write(a, 0, len);
	}
	fls.close();
	fos.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
	}
	public static void main(String[] args) {
		FileinputDome b=new FileinputDome();
		b.read("Tesx6.txt", "Test7.txt");

	}

}
