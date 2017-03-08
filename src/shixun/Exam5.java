package shixun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] param) {
		String s = null;
		PrintWriter out = null;
		BufferedReader in = null;
	 
		try {
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("«Î ‰»Îƒ⁄»›");
			out = new PrintWriter(new BufferedWriter(new FileWriter("keyin.txt")));		while((s=in.readLine())!=null){
			if(s.equalsIgnoreCase("exit")){
				break;
			}
			out.print(s);
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
