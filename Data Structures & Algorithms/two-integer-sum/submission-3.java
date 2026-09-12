class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
       

        for(int idx = 0; idx < nums.length;idx++) {
            int num = nums[idx];
            int key = target - num;
            if(mp.containsKey(key)) {
                return new int[]{mp.get(key), idx};
            }
            mp.put(num, idx);
        }
        return new int[]{0,0};
    }
}
