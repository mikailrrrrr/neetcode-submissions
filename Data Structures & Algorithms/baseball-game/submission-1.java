class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String s : operations) {
            if(s.charAt(0) == '+') {
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                sum+=c;
                st.push(b);
                st.push(a);
                st.push(c);
            } else if (s.charAt(0) == 'D') {
                int a = st.pop();
                int b = a*2;
                sum+=b;
                st.push(a);
                st.push(b);
            } else if (s.charAt(0) == 'C') {
                int val = st.pop();
                sum-= val;
            } else {
                int val = Integer.valueOf(s);
                sum+= val;
                st.push(val);
            }

        }
        return sum;
    }
}