class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++) {
            Integer n = mp.get(target - nums[i]);
            if( n != null) {
                return new int[]{n, i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
