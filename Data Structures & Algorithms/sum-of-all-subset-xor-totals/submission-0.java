class Solution {
    public void subs(int[] nums, int[] res, List<Integer> xor, int idx) {
        if (idx == nums.length) {
            int x = 0;
            for (int num : xor) {
                x ^= num;
            }
            res[0] += x;
            return;
        }
        xor.add(nums[idx]);
        subs(nums, res, xor, idx + 1);
        xor.remove(xor.size() - 1);
        subs(nums, res, xor, idx + 1);
    }

    public int subsetXORSum(int[] nums) {
        int[] res = new int[1];

        subs(nums, res, new ArrayList<>(), 0);

        return res[0];
    }
}