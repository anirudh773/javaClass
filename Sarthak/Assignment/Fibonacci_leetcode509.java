package Sarthak.Assignment;

import java.util.Scanner;

public class Fibonacci_leetcode509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fibo(n);
	}
	public static void fibo(int n) {
		int a=0;
		int b=1;
		int sum=0;
		if(n==0) {
			System.out.println("0");
		}
		else {
			for(int i=2;i<=n;i++) {
				sum=a+b;
				a=b;
				b=sum;
			}
			System.out.println(sum);
		}
	}

}
