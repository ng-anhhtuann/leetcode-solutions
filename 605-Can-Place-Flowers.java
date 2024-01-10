public class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        int cnt = 0;
        for(int i = 0; i < a.length && cnt < n; i++) {
            if(a[i] == 0) {
                int next = (i == a.length - 1) ? 0 : a[i + 1];
                int prev = (i == 0) ? 0 : a[i - 1];
                if(next == 0 && prev == 0) {
                    a[i] = 1;
                    cnt++;
                }
            }
        }
        return cnt == n;
    }
}