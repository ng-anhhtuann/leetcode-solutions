public class Solution {
    public boolean isOneBitCharacter(int[] a) {
        int n = a.length;
        int i = 0;
        while (i < n - 1)
            i += a[i] + 1;
        return i == n - 1;
    }
}{

}
