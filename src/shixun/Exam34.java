package shixun;

public class Exam34 {

	public static void main(String[] args) {
		for (int x=1;x<1001;x++){
			int sum=0;
	    	for(int y=1;y<=x/2;y++)
	    		if(x%y==0)		
	    			sum+=y;
	    		if(sum==x)
	    			System.out.println(x);
	    		
	    	
	    }

	}

}
