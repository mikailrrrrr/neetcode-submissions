class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        Arrays.sort(nums);

        int max = 0;
        int streak = 0;
        int i = 0;
        int curr = nums[0];
        while(i < nums.length) {
            if(nums[i] != curr) {
                curr = nums[i];
                streak = 0;
            }
            while(i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            max = Math.max(max,streak);
        }

        return max;
    }
}
