package javaClass;
import java.util.*;
public class Fibonnaci_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fn=fibo(n-1)+fibo(n-2);
		return fn;
	}

}
