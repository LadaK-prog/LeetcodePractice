import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            Set<Integer> set = new HashSet<>();
            boolean uniq = true;
            for (int i = start; i < n; i++) {
                if (set.contains(nums[i])) {
                    uniq = false;
                    break;
                }
                set.add(nums[i]);
            }
            if (uniq) {
                return (start + 2) / 3;
            }
        }
        return (n + 2) / 3;
    }

}