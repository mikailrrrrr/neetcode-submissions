class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (c == 0) {
                curr = nums[i];
                c++;
            } else {
                if(curr == nums[i])
                    c++;
                else {
                    c--;
                }
            }
        }
        return curr;
    }
}