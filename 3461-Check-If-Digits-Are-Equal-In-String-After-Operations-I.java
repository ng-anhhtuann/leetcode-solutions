public public class Solution {

    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                int d = a[j] - '0';
                int g = a[j + 1] - '0';
                a[j] = (char) (((d + g) % 10) + '0');
            }
        }
        return a[0] == a[1];
    }
}{

}
