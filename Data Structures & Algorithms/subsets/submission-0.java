class Solution {
    public void dfs(int[] nums,List<List<Integer>> res, List<Integer> arr, int idx) {
        if(idx == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }
        
        arr.add(nums[idx]);
        dfs(nums,res,arr,idx+1);
        arr.remove(arr.size()-1);
        dfs(nums,res,arr,idx+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,res,new ArrayList<>(), 0);
        return res;
    }
}
