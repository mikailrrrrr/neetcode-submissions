class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String s : operations) {
            if(s.charAt(0) == '+') {
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(b);
                st.push(a);
                st.push(c);
            } else if (s.charAt(0) == 'D') {
                int a = st.pop();
                int b = a*2;
                st.push(a);
                st.push(b);
            } else if (s.charAt(0) == 'C') {
                st.pop();
            } else {
                st.push(Integer.valueOf(s));
            }

        }
        int sum = 0;
        while(!st.isEmpty()) {
            sum+= st.pop();
        }

        return sum;
    }
}