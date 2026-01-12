class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double maxSum = -Double.MAX_VALUE;

        if (nums.length < k) {
            return -1;
        }

        if (n == 1) {
            return nums[0];
        }

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if (sum > maxSum) {
            maxSum = sum;
        }

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum / k;

    }
}