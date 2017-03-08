package practiceDome;

public class yanghui {
 public static void hui (int num){
	 int a[][]=new int [num][num];

	 for(int i=0;i<num;i++){
		 a[i][0]=1;
		 for(int j=1;j<=i;j++){
			 a[i][j]=a[i-1][j]+a[i-1][j-1];
		 }
	 }
	 for(int x=0;x<num;x++){
		for(int y=0;y<=x;y++){
			System.out.print(a[x][y]+" ");
		}
		System.out.println();
	 }
 }
	public static void main(String[] args) {
		hui(5);
	}

}
