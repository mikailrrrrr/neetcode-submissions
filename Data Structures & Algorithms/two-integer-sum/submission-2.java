class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
       

        for(int idx = 0; idx < nums.length;idx++) {
            if(mp.get(target - nums[idx]) != null) {
                return new int[]{mp.get(target - nums[idx]), idx};
            }
            mp.put(nums[idx], idx);
        }
        return new int[]{0,0};
    }
}
