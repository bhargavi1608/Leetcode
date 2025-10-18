import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // Smallest possible distinct value >= prev + 1
            int val = Math.max(nums[i] - k, prev + 1);

            // If val is within [nums[i]-k, nums[i]+k], it's valid
            if (val <= nums[i] + k) {
                count++;
                prev = val; // track last used distinct value
            }
        }

        return count;
    }
}
