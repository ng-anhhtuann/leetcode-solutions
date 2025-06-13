class Spreadsheet {

    private int[][] a;

    public Spreadsheet(int r) {
        a = new int[r][26];
    }

    public void setCell(String c, int v) {
        int col = c.charAt(0) - 'A';
        int row = Integer.parseInt(c.substring(1)) - 1;
        a[row][col] = v;
    }

    public void resetCell(String c) {
        this.setCell(c, 0);
    }

    public int getValue(String f) {
        int i = f.indexOf('+');
        String l = f.substring(1, i);
        String r = f.substring(i + 1);

        int left = Character.isLetter(l.charAt(0))
                ? a[Integer.parseInt(l.substring(1)) - 1][l.charAt(0) - 'A']
                : Integer.parseInt(l);

        int right = Character.isLetter(r.charAt(0))
                ? a[Integer.parseInt(r.substring(1)) - 1][r.charAt(0) - 'A']
                : Integer.parseInt(r);

        return left + right;
    }
}