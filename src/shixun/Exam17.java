package shixun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream  fls=new FileInputStream("Test.txt");
    FileOutputStream fos=new FileOutputStream("Teest.txt");
    int num=0;
    while((num=fls.read())!=-1){
    	if((num>=65&&num<=90)||((num>=97&&num<=122))){
    		num+=3;
    		if(num>90&&num<97){
    			num=65+num-97;
    		}else if(num>122){
    			num=96+num%122;
    		}
    		fos.write(num);
    		
    		
    	}else {
    		fos.write(num);
    	}
    }
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
