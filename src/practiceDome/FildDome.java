package practiceDome;

import java.io.*;

public class FildDome {
     public static void creat(String str){
    	 File file=new File(str);
    	 if(!file.exists()){
    		 file.mkdir();
    	 }else{
    		 System.out.println("����ʧ�ܣ�");
    	 }
     }
	public static void main(String[] args) {
		creat("");

	}

}
