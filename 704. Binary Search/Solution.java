class Solution {
    public int search(int[] nums, int target) {

        int first = 0;
        int end = nums.length - 1;

        while (first <= end) {
            int middle = (end + first) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                first = middle + 1;
            }
        }
        return -1;
    }
}
