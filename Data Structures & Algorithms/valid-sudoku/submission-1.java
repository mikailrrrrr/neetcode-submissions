class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        int[] rows = new int[n], cols = new int[9], box = new int[9];


        for(int i = 0; i < n;i++) {
            for(int j = 0;j < n;j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;
                int bit = 1 << (c - '0');

                int idx = (i / 3) * 3 + (j / 3);

                if((rows[i] & bit) != 0 || (cols[j] & bit) != 0 ||
                    (box[idx] & bit) != 0) {
                        return false;
                }
                rows[i] |= bit;
                cols[j] |= bit;
                box[idx]|=bit;

            }
        }

        return true;
    }
}