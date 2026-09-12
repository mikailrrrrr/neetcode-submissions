class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n*2];
        int k = n;
        for(int i = 0; i < n;i++,k++) {
            res[i] = nums[i];
            res[k] = nums[i];
        }
        return res;
    }
}