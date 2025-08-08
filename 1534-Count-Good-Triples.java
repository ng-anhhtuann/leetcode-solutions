class Solution {
    public int countGoodTriplets(int[] d, int a, int b, int c) {
        int count = 0;
        int n = d.length;

        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                if (Math.abs(d[i] - d[j]) <= a)
                    for (int k = j + 1; k < n; k++)
                        if (Math.abs(d[j] - d[k]) <= b && Math.abs(d[i] - d[k]) <= c)
                            count++;

        return count;

    }
}