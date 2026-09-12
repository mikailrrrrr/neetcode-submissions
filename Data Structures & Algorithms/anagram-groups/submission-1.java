class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            mp.computeIfAbsent(sorted, k -> new ArrayList<>())
                .add(s);
        }

        List<List<String>> res = new ArrayList<>();
        for(String key : mp.keySet()) {
            res.add(mp.get(key));
        }

        return res;
    }
}
