class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                max = Math.max(max, i - l);
                while (l < s.length() && s.charAt(l) != c) {
                    set.remove(s.charAt(l));
                    l++;
                }
                l++;

            }
            set.add(c);
        }
        return Math.max(max, s.length() - l);
    }
}

// zxyx
