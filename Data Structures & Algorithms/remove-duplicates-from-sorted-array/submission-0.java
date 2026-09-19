class Solution {
    public int removeDuplicates(int[] nums) {
        int pivot = 0;

        for(int i = 1; i < nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                pivot++;
                nums[pivot] = nums[i];
            } 
        }

        return pivot+1;
    }
}