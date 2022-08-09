class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int max = 0, count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++;

            } else {
                count = 0;
            }
            max = Math.max(count, max);

        }
        return max;

    }

}
