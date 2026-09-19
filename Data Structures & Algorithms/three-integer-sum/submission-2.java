class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                return res;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    res.add(arr);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                } else if (sum > 0)
                    r--;
                else
                    l++;
            }
        }

        return res;
    }
}

// -4,-1,-1,0,1,2
