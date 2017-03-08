package shixun;

import java.io.*;

import practiceDome.Filewrite;

public class Test5 {

	public static void main(String[] args) {
	String s;
	BufferedReader in=null;
	PrintWriter out=null;
	System.out.println("«Î ‰»Î");
    try {
    	in=new BufferedReader(new InputStreamReader(System.in));
		out=new PrintWriter(new BufferedWriter(new FileWriter("Test12.txt")));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
	while((s=in.readLine())!=null){
		if(s.equalsIgnoreCase("exit")){
			break;
		}
		out.write(s);
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally
	{
		if(out != null)
			out.close();
		if(in != null)
		{
			try{in.close();}
			catch(IOException e2){e2.getStackTrace();}
		}
	

	}

	}
}
