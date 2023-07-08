class Solution {
    public Node construct(int[][] a) {
        return build(0, 0, a.length - 1, a.length - 1, a);
    }

    public Node build(int r1, int c1, int r2, int c2, int[][] g) {
        if (r1 > r2 || c1 > c2) return null;
        boolean check = true;
        int val = g[r1][c1];
        for (int i = r1; i <= r2; i++){
            for (int j = c1; j <= c2; j++){
                if (g[i][j] != val) {
                    check = false;
                    break;
                }
            }
        }
        if (check){
            return new Node(val == 1, true, null, null, null, null);
        } else {
            int row = (r1 + r2) / 2, col = (c1 + c2) / 2;
            return new Node(false, false,build(r1, c1, row, col, g),build(r1, col + 1, row, c2, g),build(row + 1, c1, r2, col, g),build(row + 1, col + 1, r2, c2, g));
        }
    }
}