class Solution {
    public int strangePrinter(String s) {
        s = removeDuplicates(s);
        int n = s.length();
        int[][] a = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            a[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                a[i][j] = a[i + 1][j] + 1;
                for (int k = i + 1; k <= j; k++) {
                    if (s.charAt(i) == s.charAt(k)) {
                        int tmp = 0;
                        if (k != j) {
                            tmp = a[k + 1][j];
                        }
                        a[i][j] = Math.min(a[i][j], a[i][k - 1] + tmp);
                    }
                }
                // log(a);
            }
        }
        return a[0][n - 1];
    }

    void log(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("__________________");
    }

    private String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            res.append(c);
            while (i < s.length() && s.charAt(i) == c) {
                i++;
            }
        }
        return res.toString();
    }
}