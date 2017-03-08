package practiceDome;

interface faces {
	long fact(int m);

	long intPower(int m, int n);

	boolean findFactor(int m, int n);
}

public  class interfaces implements faces {
	public long fact(int m) {
		if (m == 1 || m == 2) {
			return m;
		} else {
			return m * fact(m - 1);
		}
	}

	public long intPower(int m, int n) {
	return m ^ n;
	}

	public boolean findFactor(int m, int n) {
		if (m + n > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		faces a=new interfaces();
      
       boolean c= a.findFactor(99, 4);
        if(c){
        	System.out.println("两参数之和大于100");
        }else{
        	System.out.println("两参数之和小于100");
        }
        System.out.println( a.fact(3));
        System.out.println(a.intPower(2, 0));
	}

}
