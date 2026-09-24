class Solution {
    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> arr) {
        if (arr.size() == nums.length) {
            res.add(new ArrayList<>(arr));
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i]))
                continue;
            arr.add(nums[i]);
            backtrack(nums, res, arr);
            arr.remove(arr.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, res, new ArrayList<>());

        return res;
    }
}
