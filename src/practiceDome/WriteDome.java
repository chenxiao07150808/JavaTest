package practiceDome;

import java.io.*;

public class WriteDome {
  public static void read(){
  try {
	FileOutputStream fos=new FileOutputStream("Test11.txt",true);
	DataOutputStream dos=new DataOutputStream(fos);
	String str[]={"double 数组1.22","float 数组23.23","睡觉是关键哦！"};
	for(int i=0;i<str.length;i++){
		byte []b=str[i].getBytes();
		dos.write(b);
	}
	dos.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  }
  public static void read2(){
	FileInputStream fls;
	try {
		fls = new FileInputStream("Test11.txt");
		DataInputStream dls=new DataInputStream(fls);
		int len=0;
		while(len!=-1){
			byte r[]=new byte[20];
			len=fls.read(r,0,r.length);
			if(len==-1){
				break;
			}
			String str=new String(r,0,len);
			System.out.print(str);
			System.out.println();
			fls.close();
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
     read();
     read2();
	}

}
