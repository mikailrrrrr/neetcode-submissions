class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length(), m = word2.length();
        int l = 0, r = 0;
        while(l < n || r < m) {
            if(l < n) {
                sb.append(word1.charAt(l++));
            }
            if(r < m) {
                sb.append(word2.charAt(r++));
            }
        }
        return sb.toString();
    }
}