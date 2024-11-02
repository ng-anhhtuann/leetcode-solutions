class Solution {

    public long dividePlayers(int[] a) {
        Arrays.sort(a);

        int n = a.length;
        long count = 0;

        int sum = a[0] + a[n - 1];

        for (int i = 0; i < n / 2; i++) {
            int curr = a[i] + a[n - i - 1];

            if (curr != sum) return -1;

            count += (long) a[i] * (long) a[n - i - 1];
        }

        return count;
    }
}