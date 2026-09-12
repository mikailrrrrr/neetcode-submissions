class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m)
            return false;
        int[] f = new int[26];
        int[] f2 = new int[26];
        for (int i = 0; i < n; i++) {
            f[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i] == f2[i])
                c++;
        }

        for (int i = n; i < m; i++) {
            if (c == 26)
                return true;

            char temp = s2.charAt(i - n);
            f2[temp - 'a']--;
            if (f2[temp - 'a'] == f[temp - 'a'])
                c++;
            else if (f2[temp - 'a'] == f[temp - 'a'] - 1)
                c--;

            temp = s2.charAt(i);
            f2[temp - 'a']++;
            if (f2[temp - 'a'] == f[temp - 'a'])
                c++;
            else if (f2[temp - 'a'] == f[temp - 'a'] + 1)
                c--;
        }

        return c == 26 ? true : false;
    }
}
