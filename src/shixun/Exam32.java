package shixun;

public class Exam32 {
	// �ж� 101-200 ֮���ж��ٸ����������������������
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
