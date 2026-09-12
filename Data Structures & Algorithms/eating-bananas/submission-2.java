class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1;
        int r = piles[piles.length-1];
        while(l < r) {
            int mid = l + (r - l) / 2;
            int temp = 0;
            for(int i = 0; i < piles.length;i++) {
                int num = piles[i];
                temp+= (int)Math.ceil((double)num / mid);
            }

            if(temp <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }
}

