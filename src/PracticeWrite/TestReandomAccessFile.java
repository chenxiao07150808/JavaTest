package PracticeWrite;

import java.awt.RadialGradientPaint;
import java.io.RandomAccessFile;

public class TestReandomAccessFile {

	public static void main(String[] args)throws Exception {
		Employee em1=new Employee("zhangsan", 18);
		Employee em2=new Employee("ÀîËÄ", 26);
		Employee em3=new Employee("wangwu", 22);
		RandomAccessFile raf=new RandomAccessFile("employee.txt", "rw");
        raf.writeChars(em1.name);
        raf.writeInt(em1.age);
        raf.writeChars(em2.name);
        raf.writeInt(em2.age);
        raf.writeChars(em3.name);
        raf.writeInt(em3.age);
        RandomAccessFile raf1=new RandomAccessFile("employee.txt","r" );
        String strName="";
        raf1.skipBytes(Employee.LEN*2+4);
        for(int i=0;i<Employee.LEN;i++){
        	strName+=raf1.readChar();
        }
        System.out.println(strName.trim()+":"+raf1.readInt());
        raf1.skipBytes(Employee.LEN*2+4);
        strName+="";
        for(int i=0;i<Employee.LEN;i++){
        	strName+=raf1.readChar();
        }
        System.out.println(strName.trim()+":"+raf1.readInt());
	}

}
