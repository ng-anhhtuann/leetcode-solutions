class Solution {

    public int findSmallestInteger(int[] a, int k) {
        int[] d = new int[k];
        for (int i : a) {
            int v = ((i % k) + k) % k;
            d[v]++;
        }
        int j = 0;
        while (d[j % k] > 0) {
            d[j % k]--;
            j++;
        }
        return j;
    }
}