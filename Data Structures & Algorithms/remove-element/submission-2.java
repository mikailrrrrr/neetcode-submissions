class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;
        int count = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            while (r >= 0 && nums[r] == val) r--;

            if (i > r)
                return i;
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
        return i;
    }
}