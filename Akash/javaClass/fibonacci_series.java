package javaClass;
import java.util.*;
public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fib=new Scanner(System.in);
		int n=fib.nextInt();
		int a=0;
		int b=1;
		for(int i=1; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;	
		}
		System.out.println(a);
		
		

	}

}
