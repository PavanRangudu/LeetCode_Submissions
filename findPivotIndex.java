class Solution {
    public int pivotIndex(int[] nums) {
        
        if (nums.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int i:nums) {
            sum += i;
        }
        int pivot_idx = -1;
        int prev_sum = 0;
        for (int i=0; i<nums.length; i++){
            if ((sum - nums[i] - prev_sum) == prev_sum) {
                pivot_idx = i;
                break;
            } else {
                prev_sum += nums[i];
            }
        }
        
        return pivot_idx;
    }
}