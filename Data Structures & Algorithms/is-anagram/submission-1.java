class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countA = new int[27];
        int[] countB = new int[27];
        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length();i++) {
            countA[s.charAt(i) -'a']++;
            countB[t.charAt(i) -'a']++;
        }
        int countOdd = 0;
        for(int i =0 ;i < 27;i++) {
            if(countA[i] != countB[i]) {
                countOdd++;
            }
            if(countOdd > 1) {
                return false;
            }
        }
        return true;
    }
}

