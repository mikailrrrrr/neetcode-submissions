class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String base = strs[0];
        StringBuilder sb = new StringBuilder();

        

        for(int i = 0; i < base.length();i++) {
            char c = base.charAt(i);
            for(int j = 1; j < n;j++) {
                if(i >= strs[j].length()) {
                    return sb.toString();
                }
                if(c != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}