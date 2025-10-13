class Solution {
    public boolean isArraySpecial(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++)
            if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 == 1 && a[i + 1] % 2 == 1))
                return false;
        return true;
    }
}