import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
            Arrays.sort(nums);
            int j = 0;
            int maxLen = 0;

            for(int i = 0; i < n; i++) {
                while(nums[i] - nums[j] > 1) {
                    j++;
                }
                if(nums[i] - nums[j] == 1) {
                    maxLen = Math.max(maxLen, i - j +1);
                }
            }
        return maxLen;
    }
}