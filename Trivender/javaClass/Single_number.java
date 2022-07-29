package javaClass;

public class Single_number {

	public static void main(String[] args) {
		int [] nums= {4,1,2,1,2};
		Check(nums);
	}
	public static void Check(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			int n=0;
			for(int j=1;j<nums.length-1;j++) {
				if(nums[i]==nums[j]) {
					n=1;	
				}
			}
			if(n==0) {
				System.out.println(nums[i]);
			}

        }
   }
}
