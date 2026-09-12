class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        List<List<Integer>> l = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            mp.put(nums[i],mp.getOrDefault(nums[i], 0) + 1);
            l.add(new ArrayList<>());
        }
        l.add(new ArrayList<>());

        for(Integer key : mp.keySet()) {
            l.get(mp.get(key)).add(key);
        }

        int[] res = new int[k];
        int idx = 0;

        for(int i = n;i >=0;i--) {
            List<Integer> x = l.get(i);
            for(int num : x) {
                if(idx == k)
                    return res;
                res[idx] = num;
                idx++;
            }

        }

        return res;
    }
}
