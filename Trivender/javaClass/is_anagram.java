package javaClass;
import java.util.*;

public class is_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		Anagram(str1,str2);
	}
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
