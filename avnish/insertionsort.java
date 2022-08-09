public class Main
{
	public static void main(String[] args) {
		int nums[] ={5, 1, 4, 2, 8};
        for(int i=1;i<nums.length;i++){
            int elm = nums[i];
            int j =i-1;
            while(j>=0 && nums[j]>elm){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=elm;
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
        }
	}
}