class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            
        }
        List<Integer>[] freq = new List[nums.length +1];

        for(int i = 0; i < freq.length;i++) {
            freq[i] = new ArrayList<>();
        }

        for(int key : mp.keySet()) {
            freq[mp.get(key)].add(key);
        }

        int[] res = new int[k];
        int idx = 0;
        for(int i = freq.length - 1;i >=0; i--) {
            for(int n  : freq[i]) {
                if(idx == k)
                    return res;
                res[idx++] = n;
            }
        }
        
        return res;
    }
}
