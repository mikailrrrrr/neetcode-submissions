class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            int flag = 0;
            for(int j = i+1; j < n;j++) {
                if(temperatures[j] > temperatures[i]) {
                    flag = 1;
                    break;
                } 
                count++;
                
            }
            if(flag != 0)
            result[i] = count;
        }

        return result;
    }
}
