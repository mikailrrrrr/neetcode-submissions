class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a = new int[n+2];
        int[] b = new int[n+2];
        a[0] = 1;
        a[n+1] = 1;
        b[0] = 1;
        b[n+1] = 1;
        for(int i = 0; i < n;i++) {
            a[i+1] = a[i] * nums[i];
        }

        for(int i = n; i > 0;i--) {
            b[i] = b[i+1] * nums[i-1];
        }
        int[] res = new int[n];

        for(int i = 1; i < n+1;i++) {
            res[i-1] = a[i-1] * b[i+1];
        }


        return res;
    }
} // 48 24 12 8
// 1 1  2  8  48 1 
// 1 48 48 24 6  1