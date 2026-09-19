class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        int l = m - 1, r = n - 1;
        int idx = m + n - 1;

        if (m == 0) {
            while (r >= 0) nums1[idx--] = nums2[r--];
            return;
        }
        while (l >= 0 && r >= 0) {
            if (nums1[l] > nums2[r]) {
                nums1[idx--] = nums1[l--];
            } else
                nums1[idx--] = nums2[r--];
        }

        while (l >= 0) nums1[idx--] = nums1[l--];
        while (r >= 0) nums1[idx--] = nums2[r--];
    }
}