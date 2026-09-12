class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = -1;
        int l = 0, r = n-1;
        int a = heights[0];
        int b = heights[n-1];

        while(l < r) {
            max = Math.max(max, Math.min(a, b) * (r - l));
            if(a < b) {
                a = heights[l+1];
                l++;
            } else {
                b = heights[r-1];
                r--;
            }
        
        }

        return max; 
    }
}
