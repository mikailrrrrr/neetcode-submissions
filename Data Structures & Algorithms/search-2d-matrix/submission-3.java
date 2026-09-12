class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix[0].length-1;
        int row = 0;
        for(row = 0; row < matrix.length;row++) {
            if(target <= matrix[row][r])
                break;
        }
        if(row == matrix.length)
            return false;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] < target) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }

        return false;
    }
}
