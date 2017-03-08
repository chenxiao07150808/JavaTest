package shixun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Test2 {
	public void writeDome() throws Exception{
		FileOutputStream fos=new FileOutputStream("Test12.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(12);
		dos.writeFloat(12.5f);
		dos.writeUTF("I am a student ,So I can study hary");
	dos.close();
	}
  public void readDome()throws Exception{
	  FileInputStream fls=new FileInputStream("Test12.txt");
	  DataInputStream dls=new DataInputStream(fls);
	System.out.println(  dls.readInt());
	  System.out.println(dls.readDouble());
	  System.out.println(dls.readUTF());
  dls.close();
  System.out.println("¹Ø±Õ³É¹¦");
  }
  
	public static void main(String[] args) {
		 try {

			 Test2 test=new Test2();
			 test.writeDome();
			 test.readDome();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
