package practiceDome;

public class Test22 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int count=0;
	for(int i=0;i<10;i++){
		a[i]=(int) (Math.random()*10);
		if(a[i]>=7){
			count++;
			if(count>3){
				count--;
			}
		}
	}
	for(int i=0;i<10;i++){
		if(a[i]>=7){
			System.out.println(a[i]+":");
		}else{
		
		System.out.println(a[i]);
		}
		}

	}

}
