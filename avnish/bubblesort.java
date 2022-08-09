public class Main
{
	public static void main(String[] args) {
		int nums[] ={5, 1, 4, 2, 8};
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
        }
	}
}