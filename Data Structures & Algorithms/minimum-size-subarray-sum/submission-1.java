class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum = 0;
        while(r < nums.length) {
            sum+= nums[r];
            while(l <= r && sum >= target) {
                len = Math.min(r-l+1, len);
                sum-=nums[l];
                l++;
            }
            r++;
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }
}