class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(hMap.containsKey(nums[i])) {
                result[0] = hMap.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                hMap.put(target-nums[i], i);
            }
        }
        
        return result;
    }
}