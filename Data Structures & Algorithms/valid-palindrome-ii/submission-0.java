class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        char[] c = s.toCharArray();
        while(i < j) {
            if(c[i] != c[j]) {
                if(p(c,i+1,j) || p(c,i,j-1)) {
                    return true;
                } else {
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean p(char[] c, int i, int j) {
        while(i < j) {
            if(c[i] != c[j])
                return false;
            i++;
            j--;
        }
        return true;
    } 
}