class Solution {
    public boolean threeConsecutiveOdds(int[] a) {
        for (int i = 0; i < a.length - 2; i++)
            if (a[i] % 2 == 1 && a[i + 1] % 2 == 1 && a[i + 2] % 2 == 1)
                return true;
        return false;
    }
}