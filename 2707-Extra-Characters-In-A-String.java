class Solution {
    // public int minExtraChar(String s, String[] ds) {
    //     int m = ds.length;
    //     int n = s.length();
    //     int[] c = new int[n];
    //     for (String d : ds) {
    //         int len = d.length();
    //         int idx = s.indexOf(d);
    //         char[] cs = s.toCharArray();
    //         while (idx != -1) {
    //             for (int i = idx; i < idx + len; i++) {
    //                 if (i >= n)
    //                     break;
    //                 c[i]++;
    //                 cs[i] = '0';
    //             }
    //             String g = String.valueOf(cs);
    //             idx = g.indexOf(d);
    //         }
    //     }
    //     for (int i : c) System.out.print(i);
    //     int count = 0;
    //     for (int i = 1; i < n-1; i++) {
    //         if ((c[i] < c[i-1] && c[i] < c[i+1]) || c[i] == 0) count++;
    //     }
    //     count += c[n-1] == 0 ? 1 : 0;
    //     return c[0] == 0 ? count+1 : count;
    // }

    public int minExtraChar(String s, String[] d) {
        int n = s.length();
        Set<String> set = new HashSet<>(Arrays.asList(d));
        int[] a = new int[n + 1];

        for (int l = n - 1; l >= 0; l--) {
            a[l] = a[l + 1] + 1;
            for (int r = l; r < n; r++) {
                String g = s.substring(l, r + 1);
                if (set.contains(g)) a[l] = Math.min(a[l], a[r + 1]);
            }
        }

        return a[0];
    }
}