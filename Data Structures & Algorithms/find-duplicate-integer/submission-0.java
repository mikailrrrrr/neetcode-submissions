class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        for (int num : nums) {
            if (count[num] == 1)
                return num;
            count[num]++;
        }
        return -1;
    }
}
