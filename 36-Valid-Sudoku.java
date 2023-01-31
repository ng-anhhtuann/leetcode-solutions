class Solution {
    // 2ms beat 93% memory: 42mb beat 87%
    public boolean isValidSudoku(char[][] c) {
        for (int i = 0; i < 9; i++) {
            List<Character> row = new ArrayList<>();
            List<Character> col = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if (c[i][j] != '.') {
                    if (row.contains(c[i][j])) {
                        return false;
                    } else {
                        row.add(c[i][j]);
                    }
                }
                if (c[j][i] != '.') {
                    if (col.contains(c[j][i])) {
                        return false;
                    } else {
                        col.add(c[j][i]);
                    }
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                List<Character> squ = new ArrayList<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (c[k][l] != '.') {
                            if (squ.contains(c[k][l])) {
                                return false;
                            } else {
                                squ.add(c[k][l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    // 2-3ms
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row;
        Set<Character> col;
        Set<Character> squ;
        for (int i = 0; i < 9; i++) {
            row = new HashSet<>();
            col = new HashSet<>();
            squ = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[j][i])) {
                    return false;
                }
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.' && !squ.add(board[rowIndex][colIndex])) {
                    return false;
                }
            }
        }
        return true;
    }
}