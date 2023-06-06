class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        if (n == 1)
            return true;
        int dis = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            int tmp = a[i] - a[i - 1];
            if (tmp != dis)
                return false;
        }
        return true;
    }
}