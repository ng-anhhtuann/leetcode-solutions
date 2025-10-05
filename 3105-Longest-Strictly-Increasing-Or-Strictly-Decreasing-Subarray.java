class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int n = a.length;
        int max = 0;
        int count = 1;
        int check = 2;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                if (check == 0 || check == 2) {
                    max = Math.max(max, count);
                    count = 2;
                    check = 1;
                } else {
                    count++;
                }
            } else if (a[i] < a[i - 1]) {
                if (check == 1 || check == 2) {
                    max = Math.max(max, count);
                    count = 2;
                    check = 0;
                } else {
                    count++;
                }
            } else {
                max = Math.max(max, count);
                count = 1;
                check = 2;
            }
        }
        return Math.max(max, count);
    }
}