package javaClass;

import java.util.Scanner;

public class Pow_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a =sc.nextInt();
		System.out.println("enter b");
		int b =sc.nextInt();
		System.out.println(pow(a, b));

	}

	public static int pow(int a, int b) {

		if (b == 0) {
			return 1;
		}

		int ans = pow(a, b - 1);
		return a * ans;
	}

}
