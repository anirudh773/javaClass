package Sarthak;

import java.util.Scanner;

public class To_lowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s=new Scanner(System.in);
		String str=s.next();
		LowerCase(str);
	}
	public static void LowerCase(String str) {
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				arr[i]= (char)(arr[i]-'A'+'a');
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
