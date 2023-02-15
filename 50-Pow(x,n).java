class Solution {
    public double myPow(double x, int n) {
        if (n == 1 || x == 0 || (x == -1 && n % 2 == 1))
            return x;
        if (n == 0 || x == 1.0 || (x == -1 && n % 2 == 0))
            return 1;
        if (n == Integer.MIN_VALUE)
            return (x == 1 || x == -1) ? 1 : 0;
        double res = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                res = res * x;
            }
        } else {
            n = n * (-1);
            for (int i = 0; i < n; i++) {
                res = res / x;
            }
        }
        return res;
    }

    public double myPow(double x, int n) {
        if (n == 1 || x == 0 || (x == -1 && n % 2 == 1))
            return x;
        if (n == 0 || x == 1.0 || (x == -1 && n % 2 == 0))
            return 1;
        if (n == Integer.MIN_VALUE)
            return (x == 1 || x == -1) ? 1 : 0;
        if (n < 0) {
            n = n * (-1);
            x = 1 / x;
        }
        double res = 1.0;
        double tmp = x;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * tmp;
            }
            tmp = tmp * tmp;
            n = n / 2;
        }
        return res;
    }
}