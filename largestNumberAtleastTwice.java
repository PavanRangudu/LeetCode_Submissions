class Solution {
    public int dominantIndex(int[] nums) {
        
        int prev_max = -1;
        int max = nums[0];
        int idx = 0;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > max) {
                prev_max = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > prev_max) {
                prev_max = nums[i];
            }
        }
        
        if (max >= 2*prev_max) {
            return idx;
        } else {
            return -1;
        }
    }
}