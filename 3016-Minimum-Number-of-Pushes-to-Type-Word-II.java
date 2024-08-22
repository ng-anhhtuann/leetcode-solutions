class Solution {
    int[] lst = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4 };

    public int minimumPushes(String w) {
        int n = w.length();
        int res = 0;
        int[] a = new int[26];
        for (char c : w.toCharArray())
            a[c - 'a']++;
        Arrays.sort(a);
        int cnt = 0;
        for (int i = 25; i >= 0; i--)
            res += a[i] * lst[cnt++];
        return res;
    }
}