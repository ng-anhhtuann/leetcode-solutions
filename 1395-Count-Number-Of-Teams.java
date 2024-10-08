class Solution {
    public int numTeams(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    if ((a[i] < a[j] && a[j] < a[k]) || (a[i] > a[j] && a[j] > a[k]))
                        res++;
        return res;
    }
}