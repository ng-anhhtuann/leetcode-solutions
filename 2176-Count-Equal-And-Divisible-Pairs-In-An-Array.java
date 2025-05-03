class Solution {
    public int countPairs(int[] a, int k) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if ((j * i) % k == 0 && (a[i] == a[j]))
                    count++;
        return count;
    }
}