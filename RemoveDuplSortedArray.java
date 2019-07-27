class Solution {
    public int removeDuplicates(int[] nums) {
        int new_len = 0;
        
        if (nums.length == 0) {
            return 0;
        }
        
        for(int i=1;i<nums.length; i++) {
            if (nums[i] > nums[new_len]) {
                new_len++;
                nums[new_len] = nums[i];
            }
        }
        
        return new_len + 1;
    }
}