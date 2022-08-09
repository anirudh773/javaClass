package mohammadAamir;

public class fibonacciSeries {

	public static void main(String[] args) {
             int n=2;
		
	        int n1=0;
	        int n2=1;
	        int n3=0;
	        for(int i=1;i<n;i++){
	            n3=n1+n2;
	            n1=n2;
	            n2=n3;
	        }
	        System.out.println(n3);
	}

}
