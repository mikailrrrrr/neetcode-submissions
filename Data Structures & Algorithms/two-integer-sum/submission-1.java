class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int idx = 0;
        for(int num : nums) {
            mp.put(num, idx);
            idx++;
        }

        for(idx = 0; idx < nums.length;idx++) {
            if(mp.get(target - nums[idx]) != null && idx != mp.get(target - nums[idx])) {
                return new int[]{idx, mp.get(target - nums[idx])};
            }
        }
        return new int[]{0,0};
    }
}
