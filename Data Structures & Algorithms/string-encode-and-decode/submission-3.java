class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(String.valueOf(s.length())+ "#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        char[] c = str.toCharArray();

        int i = 0;
        while( i < c.length) {
            int j = i;
            while (j < c.length && c[j] != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            i = j + 1;
            String s = str.substring(i, i+len);
            result.add(s);
            i +=len;
        }


        return result;
    }
}
