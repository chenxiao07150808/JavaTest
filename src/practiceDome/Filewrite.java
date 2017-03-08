package practiceDome;
  //Ê±¼äÎª2016.5.11
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewrite {
 public void  read(String str1,String str2){
	 try {
		FileInputStream fls=new FileInputStream(str1);
		FileOutputStream fos=new FileOutputStream(str2);
		int len=0;
		byte []b=new byte[10];
		while(len!=0){
			len=fls.read(b, 0, b.length);
			if(len==-1){
				break;
			}
			fos.write(b, 0, len);
		}
		fos.close();
		fls.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
 }
	public static void main(String[] args) {
		new Filewrite().read("Test3.txt", "Test5.txt");
	}

}
