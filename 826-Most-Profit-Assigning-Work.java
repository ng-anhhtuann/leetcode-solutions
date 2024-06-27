class Solution {

    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        if (d.length != p.length) {return 0;}

        int maxd = 0;
        for (int diff: d)
            maxd = Math.max(maxd, diff);
        // System.out.println("Max difficulty: " + maxd);

        int[] a = new int[maxd + 1];
        for (int i = 0; i < p.length; i++)
            a[d[i]] = Math.max(a[d[i]], p[i]);
        // log(a);

        int maxp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxp) maxp = a[i];
            a[i] = maxp;
        }
        // System.out.println("Max profit: " + maxp);
        // log(a);

        int result = 0;
        for (int i: w)
            result += i > maxd ? a[maxd] : a[i];
        return result;
    }

    private void log(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("_________________");
    }
}