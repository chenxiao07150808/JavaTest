package practiceDome;

public class shuixianhua {

	public static void main(String[] args) {
		for(int h=1;h<=9;h++){
			for(int t=0;t<=9;t++){
				for(int x=0;x<=9;x++){
					if(h*h*h+t*t*t+x*x*x==h*100+t*10+x){
						System.out.println("Ë®ÏÉ»¨Êý"+(h*100+t*10+x));
					}
				}
			}
		}
    double r=2;
    double sum=0;
    Integer x=new Integer(10); Integer y=new Integer(10); System.out.println (x==y); 
    System.out.println(x.equals(y));
	}

}
