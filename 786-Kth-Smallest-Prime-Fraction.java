import java.util.*;

class Solution {

    public int[] kthSmallestPrimeFraction(int[] a, int k) {
        int n = a.length;
        List<int[]> f = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    f.add(new int[]{a[i], a[j]});
                }
            }
        }

        Collections.sort(f, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                double l = (double) a[0] / a[1];
                double r = (double) b[0] / b[1];
                return Double.compare(l, r);
            }
        });

        int[] res = f.get(k - 1);
        return res;
    }
}
