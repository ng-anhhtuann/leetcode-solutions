class Solution {
    public int totalFruit(int[] a) {
        int n = a.length;
        if (n <= 2)
            return n;
        int res = 0;
        int count = 0;
        int first = 0, second = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != a[first]) {
                second = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == a[first] || a[i] == a[second]) {
                count++;
            } else {
                res = res > count ? res : count;
                first = i - 1;
                count = 2;
                while (a[first] == a[first - 1]) {
                    first--;
                    count++;
                }
                second = i;
            }
        }
        return res > count ? res : count;
    }
}
