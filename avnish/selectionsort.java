public class Main
{
	public static void main(String[] args) {
		int nums[] ={5, 1, 4, 2, 8};
        for(int i=0;i<nums.length-1;i++){
           int sml = i;
           for(int j=i+1;j<nums.length;j++){
            if(nums[j]<nums[sml]){
                sml = j;
            }
           }
           int temp=nums[sml];
           nums[sml]=nums[i];
           nums[i]=temp;
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
        }
	}
}