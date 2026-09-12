class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] <= nums[r]) {
            return nums[l];
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[l] <= nums[mid]) {
                if (nums[mid] > nums[r] ) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (nums[l] < nums[mid] || nums[mid] > nums[mid-1]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
