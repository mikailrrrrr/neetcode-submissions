class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a = 0, b = 0;
        for (String s : tokens) {
            if (s.equals("*")) {
                a = st.pop();
                b = st.pop();
                st.push(a*b);
            } else if (s.equals("+")) {
                a = st.pop();
                b = st.pop();
                st.push(a+b);
            } else if (s.equals("-")) {
                a = st.pop();
                b = st.pop();
                st.push(b-a);
            } else if (s.equals("/")) {
                a = st.pop();
                b = st.pop();
                st.push(b/a);
            } else {
                st.push(Integer.valueOf(s));
            }
        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum+=st.pop();
        }

        return sum;
    }
}
// 4 13 5 /
// 4 2 +
// 6 10 15 -
