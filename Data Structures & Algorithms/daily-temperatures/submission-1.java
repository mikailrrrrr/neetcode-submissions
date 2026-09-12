class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<int[]> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int t = temperatures[i];
            while(!st.isEmpty() &&  t > st.peek()[0]) {
                int idx = st.pop()[1];
                result[idx] = i - idx;
            }
            st.add(new int[]{t, i});
        }

        return result;
    }
}
