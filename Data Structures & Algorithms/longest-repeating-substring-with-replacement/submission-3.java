class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        for(int i = 0; i < s.length();) {
            char c = s.charAt(i);
            freq[c - 'A']++;
            maxFreq = 0;
            for(int j = 0; j< 26;j++) {
                maxFreq = Math.max(maxFreq, freq[j]);
            }
            if((i - l + 1 - maxFreq) <= k) {
                max = Math.max(max, i - l + 1);
            } else {
                freq[s.charAt(l) - 'A']--;
                freq[c - 'A']--;
                l++;
                continue;
            }
            i++;
        }
        return max;
    }
}
// 4 - 1 + 1 = 4 -
// 