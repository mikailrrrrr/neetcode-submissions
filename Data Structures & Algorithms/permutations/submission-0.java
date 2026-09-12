class Solution {
    public void perm(int[] nums, List<List<Integer>> res, List<Integer> arr) {
        if (arr.size() == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }

        for (int num : nums) {
            if(arr.contains(num))
                continue;
            arr.add(num);
            perm(nums, res, arr);
            arr.remove(arr.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        perm(nums, res, new ArrayList<>());
        return res;
    }
}
