package practiceDome;

import java.util.Scanner;

public class newDome {

	public static void main(String[] args) {
for(int i=1;i<=9;i++){
	for(int x=1;x<=9;x++){
		System.out.print(i+"*"+x+"="+x*i+" ");
	}
	System.out.println();
}
for(int j=1;j<=9;j++){
	for(int y=1;y<=j;y++){
		System.out.print(j+"*"+y+"="+j*y+"   ");
	}
	System.out.println();
}
  for(int a=1;a<=9;a++){
	  for(int b=1;b<a;b++){
		  System.out.print("*");
	  }
	  System.out.println();
  }
  for(int c=9;c>=1;c--){
	  for(int d=1;d<c;d++){
		  System.out.print("*");
	  }
	  System.out.println();
  }
  for(int q=1;q<=9;q++){
	  for(int w=0;w<=9;w++){
		  for(int p=0;p<=9;p++){
			  if(w*w*w+q*q*q+p*p*p==q*100+w*10+p){
				  System.out.println(q*100+w*10+p+"水仙花数");
			  }
		  }
	  }
  }
  int []str={12,34,56,67,88};
  int index=-1;
  System.out.println("输入数字！");
  
  
	}

}
