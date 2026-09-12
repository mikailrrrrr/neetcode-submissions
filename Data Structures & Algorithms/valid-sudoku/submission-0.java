class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> box = new ArrayList<>();
        for(int i = 0; i < n;i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            box.add(new HashSet<>());

        }


        for(int i = 0; i < n;i++) {
            for(int j = 0;j < n;j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;

                int idx = (i / 3) * 3 + (j / 3);

                if(rows.get(i).contains(c) ||
                    cols.get(j).contains(c) ||
                    box.get(idx).contains(c)) {
                        
                        return false;
                }
                rows.get(i).add(c);
                cols.get(j).add(c);
                box.get(idx).add(c);

            }
        }

        return true;
    }
}