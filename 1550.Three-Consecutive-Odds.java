class Solution {
    public boolean threeConsecutiveOdds(int[] a) {
        int count = 0;
        for ( int i : a ) {
            count = i % 2 == 1 ? count + 1 : 0;
            if (count == 3) return true;
        }
        return false;
    }
}