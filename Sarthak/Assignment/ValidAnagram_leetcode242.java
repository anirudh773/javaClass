package Sarthak.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram_leetcode242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
//		System.out.println(isAnagram(str1,str2));
		
		Anagram(str1,str2);
	}
//	 public static boolean isAnagram(String s, String t) {
//	        if(s.length()!=t.length()){
//	            return false;
//	        }
//	        int []fre=new int[26];
//	        for(char ch:s.toCharArray()){
//	            fre[ch-'a']++;
//	        }
//	        for(char ch:s.toCharArray()){
//	            fre[ch-'a']--;
//	        }
//	        for(int i=0;i<26;i++){
//	            if(fre[i]!=0){
//	                return false;
//	            }
//	        }
//	        return true;
//	    }
//	 
	 
	          // Alternate Method
	 public static void Anagram(String s,String t) {
		 if(s.length()!=t.length()) {
			 System.out.println("false");
		 }
		 else {
		 char [] arr1=s.toCharArray();
		 char [] arr2=s.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 boolean result=Arrays.equals(arr1, arr2);
		 System.out.println(result);
		 }
	 }
	 
	 
	}


