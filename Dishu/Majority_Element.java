
public class Majority_Element {

    public int majorityElement(int[] nums) {
        int index = 0;
        int ct = 1,ans=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index])
                ct++;
            else
                ct--;
            if (ct == 0) {
                index = i;
                ct = 1;
            }
        }
        ct = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[index] == nums[j])
                ct++;
        }
        if (ct > nums.length)
           ans = nums[index];
        return nums[index];
    }
}
