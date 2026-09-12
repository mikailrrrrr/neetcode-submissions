class Solution {
    public boolean isPalindrome(String s) {
            
        int i = 0, j = s.length()-1;
        char[] c = s.toLowerCase().toCharArray();
        while(i < j) {
            if((c[i] < 'A' || c[i] > 'Z') && 
                (c[i] < 'a' || c[i] >'z') && 
                (c[i] < '0' || c[i] > '9')) {
                i++;
                continue;
            }
            if((c[j] < 'A' || c[j] > 'Z') && 
                (c[j] < 'a' || c[j] >'z') && 
                (c[j] < '0' || c[j] > '9')) {
                    j--;
                    continue;
            }

            if(c[i] != c[j]) 
                return false;

            i++;
            j--;
        }
        
        return true;
    }
}
