package javaClass;

public class To_Lower_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Hello";
		System.out.println(lower(str));

	}

	public static String  lower(String str) {
		// TODO Auto-generated method stub
		
		char [] ch= str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]-'A' + 'a');
			}
		}
		return new String(ch);
		
	}

}
