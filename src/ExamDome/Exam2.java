package ExamDome;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam2 {
    public void writeData() throws Exception{
	try {
		FileOutputStream fos=new FileOutputStream("exam2.txt",true);
		DataOutputStream dos=new DataOutputStream(fos);
		String str[]={"整型数据（int）：12","单精度浮点型数据（float）：88.6","字符串类型数据（String）：you are best!"};
		for(int i=0;i<2;i++){
		byte []b=str[i].getBytes();
		dos.write(b);
	     }
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
    public void readData()throws Exception{
    	try {
			FileInputStream fls=new FileInputStream("exam2.txt");
			DataInputStream dls=new DataInputStream(fls);
			int len=0;
			while(len!=-1){
				byte []b=new byte[60];
			  len=dls.read(b, 0, b.length);
			  if(len==-1){
				  break;
			  }
			  String str2=new String(b,0,len);
			  System.out.print(str2);
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void main(String[] args) {
		try {
			Exam2 e2 =new Exam2();
			e2.writeData();
			e2.readData();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
