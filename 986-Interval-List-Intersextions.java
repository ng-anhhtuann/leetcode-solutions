class Solution {
    /**
     * Slow approach
     */
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int m = a.length, n = b.length;
        if (m == 0 || n == 0)
            return new int[0][0];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int la = a[i][0], ra = a[i][1];
            for (int j = 0; j < n; j++) {
                int lb = b[j][0], rb = b[j][1];
                int[] tmp = new int[2];
                if (la < lb && ra < rb && ra >= lb) {
                    tmp[0] = lb;
                    tmp[1] = ra;
                } else if (la > lb && ra > rb && rb >= la) {
                    tmp[0] = la;
                    tmp[1] = rb;
                } else if (la >= lb && ra <= rb) {
                    tmp[0] = la;
                    tmp[1] = ra;
                } else if (la <= lb && ra >= rb) {
                    tmp[0] = lb;
                    tmp[1] = rb;
                } else if (rb < ra && ra == lb) {
                    tmp[0] = lb;
                    tmp[1] = lb;
                } else if (la == rb && ra > rb) {
                    tmp[0] = rb;
                    tmp[1] = rb;
                } else {
                }
                if (!(tmp[0] == 0 && tmp[1] == 0))
                    list.add(tmp);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }

    /**
     * Better by 2 pointers
     */
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int m = a.length, n = b.length;
        if (m == 0 || n == 0)
            return new int[0][0];
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            int la = a[i][0], ra = a[i][1];
            int lb = b[j][0], rb = b[j][1];
            int l = Math.max(la, lb), r = Math.min(ra, rb);
            if (l <= r) {
                list.add(new int[] { l, r });
            }
            if (ra < rb) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[0][0]);
    }

    /**
     * Best solution
     */
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int m = a.length, n = b.length;
        if (m == 0 || n == 0)
            return new int[0][0];
        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();
        while (i < m && j < n) {
            int la = a[i][0], ra = a[i][1];
            int lb = b[j][0], rb = b[j][1];
            if (la <= rb && lb <= ra) {
                list.add(new int[] { Math.max(la, lb), Math.min(ra, rb) });
            }
            if (ra < rb) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[0][0]);
    }
}