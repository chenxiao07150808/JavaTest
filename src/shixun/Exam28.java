package shixun;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.mysql.jdbc.Buffer;

import practiceDome.newDome;
public class Exam28 {
	public static void main(String[] args) {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try {
			BufferedInputStream fb=new BufferedInputStream(new FileInputStream("Text11.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    try {
    	BufferedReader br=new BufferedReader(new FileReader("Tese11.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text11.txt"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		BufferedReader gf=new BufferedReader(new FileReader("Test11.txt"));
		BufferedReader gd=new BufferedReader(new InputStreamReader(System.in));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		PrintWriter a=new PrintWriter("Test.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		PrintWriter b=new PrintWriter(new FileWriter("",true));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		PrintWriter c=new PrintWriter(new BufferedWriter(new FileWriter("")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
