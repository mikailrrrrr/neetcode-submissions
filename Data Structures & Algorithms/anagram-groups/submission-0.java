class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> mp = new HashMap<>();
        
        for(String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            mp.putIfAbsent(new String(charArr), new ArrayList<>());
            mp.get(new String(charArr)).add(str);
        }

        return new ArrayList<>(mp.values());
    }
}
