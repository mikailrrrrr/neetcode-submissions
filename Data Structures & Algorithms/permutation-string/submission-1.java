class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m)
            return false;
        int[] f = new int[26];
        for(char c : s1.toCharArray()) {
            f[c - 'a']++;
        }

        for(int i = 0; i <=m-n;i++) {
            char temp = s2.charAt(i);
            if(f[temp - 'a'] != 0) {
                int[] f2 = new int[26];
                int flag = 0;
                for(int j = i; j < i+n;j++) {
                    temp = s2.charAt(j);
                    f2[temp - 'a']++;
                }
                for(int j = 0; j < 26;j++) {
                    if(f[j] != f2[j]) {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                    return true;
            }
        }
        return false;
    }
}
