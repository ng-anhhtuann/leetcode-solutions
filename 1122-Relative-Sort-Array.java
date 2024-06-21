class Solution {
    public int[] relativeSortArray(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int num = 0;
        for (int i : b) {
            for (int j = 0; j < m; j++) {
                if (i == a[j]) {
                    if ( j != num ) {
                        a[j] = a[j] ^ a[num];
                        a[num] = a[j] ^ a[num];
                        a[j] = a[j] ^ a[num];
                    }
                    num++;
                }
            }
        }
        Arrays.sort(a,num,m);
        return a;
    }
}