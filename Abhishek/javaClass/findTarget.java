package javaClass;

public class findTarget {
	static int printTarget(int a[] , int target) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			if(a[i]>= target)
				return i;
		}
		return n;
	}

	public static void main(String[] args) {
		int a [] = {1,3,5,6} , target = 5;
		System.out.println(printTarget (a , target));
	}
	}


