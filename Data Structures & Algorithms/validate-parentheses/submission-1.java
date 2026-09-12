class Solution {
    public boolean isValid(String s) {
        Stack<Character> q = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '[' || c == '(' || c == '{') {
                q.push(c);
                continue;
            }

            if(q.isEmpty())
                return false;

            char b = q.pop();
            if((b == '{' && c != '}') ||  (b == '[' && c != ']') || ((b == '(' && c != ')')))
                return false;
        }
        return q.isEmpty();
    }
}
