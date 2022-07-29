
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
//		pow(x,n);
		Pow(x,n);
	}


	public static void pow(int x,int n) {
                            // it will work only positive power
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*x;
		}
		System.out.println(result);
	}


	public static void Pow(double x,int n) {
		double result=1.0;
		long  kj=n;
		if(kj<0) {
			kj=-1*kj;
		}
        while(kj>0) {
        	if(kj%2==1) {
        		result=result*x;
        		kj--;
        	}
        	else {
        		x=x*x;
        		kj=kj/2;
        	}
        }
        if(n<0) {
        	result=(double)(1.0)/(double)(result);
        }
        System.out.println(result);
	}

}
