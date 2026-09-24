class Solution {
    public int dfs(int[] nums, int total, int idx) {
        if (idx == nums.length) {
            return total;
        }
        return dfs(nums, total ^ nums[idx], idx + 1) + dfs(nums, total, idx + 1);
    }

    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
}