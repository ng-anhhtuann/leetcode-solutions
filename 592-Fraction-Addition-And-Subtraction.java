class Solution {
    public String fractionAddition(String ex) {
        int t = 0;
        int m = 1;

        String[] a = ex.split("/|(?=[-+])");

        for (int i = 0; i < a.length; i += 2) {
            int currt = Integer.valueOf(a[i]);
            int currm = Integer.valueOf(a[i + 1]);

            t = t * currm + currt * m;
            m = m * currm;
        }

        int gcd = Math.abs(gcd(t, m));

        t /= gcd;
        m /= gcd;

        return t + "/" + m;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}