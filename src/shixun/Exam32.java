package shixun;

public class Exam32 {
	// 判断 101-200 之间有多少个素数，并输出所有素数。
	public static void main(String[] args) {
		int a=0;
	for(int i=101;i<200;i++){
		boolean is=false;
		for(int j=2;j<i;j++){
			if(i%j==0){
				is=true;
				break;
			}
		}
		if(is){
			a++;
		}
	}
System.out.println(a);
	}

}
