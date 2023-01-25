class Solution {
    // public void solveSudoku(char[][] board) {
    // if (board == null || board.length == 0) {
    // return;
    // }
    // solve(board);
    // }
    // private boolean solve(char[][] board) {
    // for (int i = 0; i < board.length; i++) {
    // for (int j = 0; j < board[0].length; j++) {
    // if (board[i][j] == '.') {
    // for (char c = '1'; c <= '9'; c++) {
    // if (isValid(board, i, j, c)) {
    // board[i][j] = c;
    // if (solve(board)) {
    // return true;
    // } else {
    // board[i][j] = '.';
    // }
    // }
    // }
    // return false;
    // }
    // }
    // }
    // return true;
    // }
    // private boolean isValid(char[][] board, int row, int col, char c) {
    // for (int i = 0; i < 9; i++) {
    // if (board[i][col] != '.' && board[i][col] == c) {
    // return false;
    // }
    // if (board[row][i] != '.' && board[row][i] == c) {
    // return false;
    // }
    // if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' && board[3 *
    // (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
    // return false;
    // }
    // }
    // return true;
    // }

    // DFS Algo
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    row[i][num] = col[j][num] = box[(i / 3) * 3 + j / 3][num] = true;
                }
            }
        }
        solve(board, row, col, box, 0, 0);
    }

    private boolean solve(char[][] board, boolean[][] row, boolean[][] col, boolean[][] box, int i, int j) {
        if (i == 9) {
            i = 0;
            if (++j == 9) {
                return true;
            }
        }
        if (board[i][j] != '.') {
            return solve(board, row, col, box, i + 1, j);
        }
        for (int num = 0; num < 9; num++) {
            int boxIndex = (i / 3) * 3 + j / 3;
            if (!row[i][num] && !col[j][num] && !box[boxIndex][num]) {
                row[i][num] = col[j][num] = box[boxIndex][num] = true;
                board[i][j] = (char) (num + '1');
                if (solve(board, row, col, box, i + 1, j)) {
                    return true;
                }
                row[i][num] = col[j][num] = box[boxIndex][num] = false;
                board[i][j] = '.';
            }
        }
        return false;
    }
}