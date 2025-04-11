class Solution {
    public int[] pivotArray(int[] a, int piv) {
        int n = a.length;
        int[] r = new int[n];
        int idx = 0;

        int eC = 0;
        int idxM = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < piv)
                r[idx++] = a[i];
            if (a[i] == piv)
                eC++;
            if (idxM < i && a[i] > piv)
                idxM = Math.min(idxM, i);
        }

        for (int i = 0; i < eC; i++)
            r[idx++] = piv;
        for (int i = idxM; i < n; i++) {
            if (a[i] > piv)
                r[idx++] = a[i];
        }
        return r;
    }
}