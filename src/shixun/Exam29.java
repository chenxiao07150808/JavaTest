package shixun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exam29 {

	public static void main(String[] args) {

		String s;
		BufferedReader in = null;
		PrintWriter out = null;
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("«Î ‰»Î");
		try {
			out=new PrintWriter("Test101.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while((s=in.readLine())!=null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				out.print(s);
				
			}
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
